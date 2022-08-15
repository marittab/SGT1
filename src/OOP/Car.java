package OOP;

public class Car {

    //Fields
    private String color;
    private String brand;
    private int maxSpeed;

    //Methods

    //Setter Method to possibility to set private field(Private String color)


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color){
        this.color = color;//(lai atšķirtu, kurš ir kurš. this. nosaka, ka šis būs field nosaukums)
    }

    //Geter method to read private Field
    public String getColor(){
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void printCarInfo(){
        System.out.println("Car info:");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Maximum speed: " + maxSpeed);
    }

}
