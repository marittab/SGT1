package OOP;

public class CallingAnimal {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Cat", "Maine coon",10.5f, 14 );
        animal1.printAnimalInfo();


        Animal animal2 = new Animal("Dog", "Beagle", 7.8f);
        animal2.printAnimalInfo();
        animal2.setAvgLifespan(20);
        animal2.printAnimalInfo();

        Animal animal3 = new Animal();
    }

}
