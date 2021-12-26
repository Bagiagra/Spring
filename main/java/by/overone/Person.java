package by.overone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Person {

  //  @Value("Anton")
    @Value("${person.name}")
    private String name;
   // @Value("25")
    @Value("${person.age}")
    private  int age;
    @Autowired
    @Qualifier("catBean")
    private Pet pet;

    public Person(){

    }

    public Person(Pet pet) {
        System.out.println("Person created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello my pet");
        pet.say();
    }

    public void initMethod(){
        System.out.println("Init method");
    }

    public void destroyMethod(){
        System.out.println("Destroy method");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName()) && Objects.equals(getPet(), person.getPet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getPet());
    }
}
