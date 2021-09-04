package part1.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import part1.IoC.Pet;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        Person person= new Person(pet);
        person.callPet();

    }
}
