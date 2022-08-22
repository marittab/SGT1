package oop.abstraction;

abstract class Animal{
    protected String name;
    public void sleep(){
        System.out.println("zzzzzzzzz");
    }
    public abstract void animalSound();// animalSound noteikti jāiekļauj visās klasēs, kas extends Animal
}
class Pig extends Animal {
    public void animalSound(){
        System.out.println("Oink oink");
    }

}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("Bark bark");
    }
}


public class AbstractClassExample {
    public static void main(String[] args) {
       // Animal animal = new Animal();

        Pig pig = new Pig ();
        pig.sleep();
        pig.name = "Peppe";
        pig.animalSound();
    }
}
