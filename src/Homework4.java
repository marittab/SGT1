import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year");
        int x = scanner.nextInt();
        int y = 400;
        int z = 4;
        int w = 100;


        if (x % y == 0){
            System.out.println("Leap year");

        }else if ((x % z == 0) && (x % w > 0)){
            System.out.println("Leap year");

        }
        else {
            System.out.println("Not a leap year");
        }

       /* //shorter
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = scanner.nextInt();
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Leap year");
                }   else{
                        System.out.println("Not a leap year");*/
                    }
    }

