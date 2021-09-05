package spring_course.p1_spring_basics.XMLconfiguration;

import spring_course.p1_spring_basics.Pet;

public class Dog implements Pet {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Dog(){
        System.out.println("Dog Bean is created");
    }
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    public void init (){
        System.out.println("Class Dog: init method");
    }

    public void destroy (){
        System.out.println("Class Dog: destroy method");
    }
}

