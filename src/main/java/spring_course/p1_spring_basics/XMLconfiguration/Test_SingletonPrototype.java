package spring_course.p1_spring_basics.XMLconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Singleton - default scope, создается сразу после прочтения его Spring Container, даже без обращения к context.getBean
//          - создается один раз и далее для всех обращений ссылается на один объект, а не создает новые.
//          - для stateless объектов (не хранит никакого состояния, в единственном экз.: Sun, Moon, Earth etc)
//Prototype - антоним Singleton, создается только после обращения к Spring Container с помощью метода context.getBean
//          - для каждого обращения создается новый бин
//          - для stateful объектов (хранят какое то состояние, например имя, возраст и т.д)

public class Test_SingletonPrototype {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContextSingleton.xml");// может быть написан явно или нет scope="singleton" в конфиг файле, дефолтный scope,
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextPrototype.xml");
        Dog myPet = context.getBean("myPet", Dog.class);
        myPet.setName("Belka");
        Dog yourPet = context.getBean("myPet", Dog.class);
        yourPet.setName("Strelka");
        System.out.println("Переменные myPet и yourPet ссылаются на один и тот же объект? " + (myPet == yourPet));
        System.out.println(myPet.getName());
        System.out.println(yourPet.getName());

    }
}
