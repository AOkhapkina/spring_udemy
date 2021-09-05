package spring_course.p1_spring_basics.XMLconfiguration;
//part1.IoC InversionOfControl- инверсия (аутсорсинг, делигирование) создания и управления объектами фреймворку Spring

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_course.p1_spring_basics.Pet;

public class Test_IoC {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_IoC_DI.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        context.close();

    }
}
