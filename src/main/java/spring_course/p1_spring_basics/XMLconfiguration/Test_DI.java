package spring_course.p1_spring_basics.XMLconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_DI {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext_IoC_DI.xml");
     // Pet pet = context.getBean("myPet", Pet.class); adding dependency by Constructor in config file (DI)
     // Person person= new Person(pet); // adding dependency by Constructor in config file (it's 1 of 3 methods for injection DI)
        Person person= context.getBean("myPerson",Person.class);
        person.callPet();

        context.close();

    }
}
