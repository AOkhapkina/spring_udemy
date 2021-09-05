package spring_course.p1_spring_basics.annotations;

import org.springframework.stereotype.Component;
import spring_course.p1_spring_basics.Pet;

@Component("catBean")
public class Cat implements Pet {

    public Cat(){
        System.out.println("Cat Bean is created");
    }
    @Override
    public void say() {
        System.out.println("Meow-meow");

    }
}
