package spring_course.p1_spring_basics.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConfigWithConstructorAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextComponentAnnotation.xml");
        Person person = context.getBean("beanPerson", Person.class);
        person.callPet();

    }
}
