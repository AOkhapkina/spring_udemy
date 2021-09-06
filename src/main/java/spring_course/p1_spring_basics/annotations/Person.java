package spring_course.p1_spring_basics.annotations;
/*
use ONE of DI types : Constructor (best,short enough and immutable) or Field (so-so, the shortest, but too many dependencies) or Setter (worse, too long) Injection
We all love and follow Single Responsibility Principle. If your class depends on too many things, it is an indication of something is just isn’t right about the design.
With better designs, these are no such problems. We should discourage (avoid) supporting bad design. Hence (so), we won’t give importance to the case of ‘Too Many Instance Fields’.
In exceptional scenarios, where having too many fields is unavoidable, and ugly constructor is kind of a big issue, you should take a call and go for Field Injection.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring_course.p1_spring_basics.Pet;

@Component("beanPerson")
public class Person {
//    @Autowired //DI by field
    private Pet pet; // чтобы Spring мог внедрять DI, нужно указать в полях что есть у Person (House, Pet, car..etc. В свою очередь у House есть Door, Window..etc
    private String surname;
    private int age;

    public Person() {
        System.out.println("Person Bean is created");
    }

    @Autowired
    public Person(Pet pet) { // DI by Constructor
        System.out.println("In Person Class Pet dependency is injected with @Autowired annotation");
        this.pet = pet;
    }

//    @Autowired
    public void setPet(Pet pet) {// DI by setter
        this.pet = pet;
        System.out.println("In Person Class Pet dependency is injected with @Autowired annotation");
    }

    public void setSurname(String surname) {
        this.surname = surname;
        System.out.println("The person has an age set");
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("The person has a surname set");
    }

    public void callPet() {
        System.out.println(("Hello, my lovely pet!"));
        pet.say();

    }

}
