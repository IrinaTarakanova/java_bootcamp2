package com.automationexercise.Day2;

public class AnimalActivity {

    public static void main(String arg[]) {

        // Use interfaces to declare identifiers instead of the actual classes (create Cat using interface Animal)
        Animal cat = new Cat();
        Animal dog = new Dog();


        Mammal mammal = new Mammal("Flexy");

        mammal.setAnimal(cat);

        mammal.animalIsSleeping();

        mammal.animalIsSpeaking();

        mammal.setAnimal(dog);

        mammal.animalIsSleeping();

        mammal.animalIsSpeaking();

    }
}