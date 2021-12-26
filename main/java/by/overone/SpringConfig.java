package by.overone;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("by.overone")
@PropertySource("classpath:myApplication.properties")
public class SpringConfig {

    // @Bean
    // public Person person(){
    //    return new Person();
//  }

    // @Bean
    // public Pet pet(){
    //    return new Pet(Dog);
//  }

}
