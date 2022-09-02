package homework;

public class Car extends Vehicle { //we need empty default constructor in Vehicle clas or make a new custom constructor for car clas with super

    boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        super(fuel, fuelUsage, passengers); //reusing custom constructor from Vehicle
        this.airConditioner = airConditioner;
    }

    public float maxDistance() {
        float airConditionerAdd;
        if (airConditioner) {
            airConditionerAdd = 1.1f;
        } else {
            airConditionerAdd = 1f;
        }
        float usage = fuelUsage * (1 + passengers * 0.05f);
        float maxDistance = fuel / (usage + airConditionerAdd) * 100;
        return maxDistance;
    }
}


/*            double fuelWithPassengers = ((passengers * 0.05) * fuelUsage) + fuelUsage;
            double fuelWithPassengersAC = (fuelWithPassengers * 0.1) + fuelWithPassengers;

            if (airConditioner = true) {
                System.out.println(fuel * 100 / fuelWithPassengersAC);
            } else {
                System.out.println(fuel * 100 / fuelWithPassengers);

            }
        }

            public static void main (String[]args){
                Car myVehicle2 = new Car(55.5f, 5.5f, 5, true);

                System.out.printf("%.2f", myVehicle2.maxDistance());
            }*/


       // }
