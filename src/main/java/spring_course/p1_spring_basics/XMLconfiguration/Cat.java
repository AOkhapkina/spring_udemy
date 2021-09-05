package spring_course.p1_spring_basics.XMLconfiguration;

import spring_course.p1_spring_basics.Pet;

public class Cat implements Pet {

    public Cat(){
        System.out.println("Cat Bean is created");
    }
    @Override
    public void say() {
        System.out.println("Meow-meow");

    }
}
