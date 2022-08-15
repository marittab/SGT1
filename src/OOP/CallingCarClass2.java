package OOP;

import java.util.Scanner;

public class CallingCarClass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter car's brand:");
        String brand = scanner.nextLine();
        System.out.println("Please enter car's color:");
        String color = scanner.nextLine();
        System.out.println("Please enter car's maximum speed:");
        int maxSpeed = scanner.nextInt();

        Car car1 = new Car();
        car1.setBrand(brand);
        car1.setColor(color);
        car1.setMaxSpeed(maxSpeed);

        car1.printCarInfo();

        Car car2 = new Car();
        car2.setMaxSpeed(250);
        car2.setBrand("Volvo");
        car2.setColor("green");

        car2.printCarInfo();
    }
}
