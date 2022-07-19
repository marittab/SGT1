import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = scanner.nextInt();
        System.out.println("Please enter your 2nd number");
        int number2 = scanner.nextInt();
        System.out.println("Please enter your 3rd number");
        int number3 = scanner.nextInt();
        if (number > number3 && number > number2){
            System.out.println("The greatest number is: "+ number);

        } else if(number2 > number && number2 > number3){
            System.out.println("The greatest number is: " + number2);

        } else {
            System.out.println("The greatest number is: " + number3);
        }


        //shorter version
        System.out.println(Math.max(Math.max(number,number2),number3));
    }
}
