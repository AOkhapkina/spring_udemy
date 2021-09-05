package spring_course.p1_spring_basics.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring_course.p1_spring_basics.Pet;
@Component ("beanPerson")
public class Person {
    private String surname;
    private int age;
    private Pet pet; // чтобы Spring мог внедрять DI, нужно указать в полях что есть у Person (House, Pet, car..etc. В свою очередь у House есть Door, Window..etc

@Autowired
    public Person(Pet pet){
        System.out.println("Person Bean with Pet dependency is created by Construction with parameters and @Autowired annotation");
        this.pet= pet;
    }

//public Person() {
//      System.out.println("The person Bean is created");
//}
    public void setPet(Pet pet){
        this.pet= pet;
        System.out.println("The pet Bean is created");
    }

    public void setSurname(String surname) {
        this.surname = surname;
        System.out.println("The person has an age set");
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("The person has a surname set");
    }

    public void callPet(){
        System.out.println(("Hello, my lovely pet!"));
        pet.say();

    }

}
