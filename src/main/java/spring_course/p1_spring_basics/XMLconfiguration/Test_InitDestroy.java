package spring_course.p1_spring_basics.XMLconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_course.p1_spring_basics.Pet;

public class Test_InitDestroy {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextInitDestroy.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        //init отработал без вызова, но пока мы не закроем context неперейдем к методу destroy
        context.close();
        // destroy отработал
    }

}
