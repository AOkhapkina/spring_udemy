package part1.IoC;
//part1.IoC InversionOfControl- инверсия (аутсорсинг, делигирование) создания и управления объектами фреймворку Spring

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        context.close();

    }
}
