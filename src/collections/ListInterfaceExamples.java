package collections;

import java.util.ArrayList;

public class ListInterfaceExamples {
    public static void main(String[] args) {

        //ArrayList Declaration
        ArrayList <String> car = new ArrayList<>();

        //Add elements
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");

        //Print out all elements
        System.out.println(car);

        //Get elements by index
        System.out.println(car.get(1));//Counting starts with 0

        //Add element at specific index
        car.add(2,"Ford");
        System.out.println(car);

        //Change element value
        car.set(2, "Toyota");
        System.out.println(car);

        //Remove elements at index
        car.remove(5);
        System.out.println(car);

        //Get a size of the Array list
        System.out.println(car.size());

        //Delete all elements
        car.clear();
        System.out.println(car);

    }
}
