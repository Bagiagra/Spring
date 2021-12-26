package by.overone;

import org.springframework.stereotype.Component;

@Component
public class Dog implements  Pet{

    public Dog () {
        System.out.println("Dog created");
    }

    public void say(){
        System.out.println("Gaf-gaf");
    }
}
