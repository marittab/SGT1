package oop.inheritance;

public class Vehicle {
    //Fields
    protected String brand; //protected joprojām darbojas kā privāts, bet pieejams apakšklasēm

    //Methods
    public void honk(){
        System.out.println("Tuut, tuut!");
        System.out.println("My brand is " + brand);
    }
}

class  Bike extends Vehicle{ //apakšklase Vehicle klasei

    public void honk() { // Pārraksta hank metodi iekš Bike klases
        System.out.println("Pff Pff");
        System.out.println("My brand is: " + brand);
    }


    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.honk();
        bike.brand = "Volvo";
        bike.honk();
    }

}