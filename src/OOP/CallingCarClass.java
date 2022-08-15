package OOP;

import java.util.Scanner;

public class CallingCarClass {
    public static void main(String[] args) {

        //Create a new object from Car class template
        //Set field values
        //Call printCarInfo method to check field values

        Car car1 = new Car();
        //car1.brand = "BMW"; var lietot, ja Field ir public
        //car1.maxSpeed = 208;
        //car1.color = "Black"; šādi nestrādā, jo Field ir private
        car1.setColor("Black");
        car1.setBrand("BMW");
        car1.setMaxSpeed(208);

        car1.printCarInfo();

        //Access individual fields
        //System.out.println("Max speed is: " + car1.maxSpeed);šādi drukā, ja Public field
        System.out.println("Car color is " + car1.getColor());
        System.out.println("Max speed is: " + car1.getMaxSpeed());
    }
}
