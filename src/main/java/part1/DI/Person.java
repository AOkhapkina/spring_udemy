package part1.DI;

import part1.IoC.Pet;

public class Person {
    private Pet pet;

    public Person(Pet pet){
        this.pet= pet;
    }

    public void callPet(){
        System.out.println(("Hello, my lovely pet!"));
        pet.say();

    }

}
