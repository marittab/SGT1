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

//another version

/*
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input the 1st number");
            int nr1 = scanner.nextInt();
            System.out.println("Input the 2nd number");
            int nr2 = scanner.nextInt();
            System.out.println("Input 3rd number");
            int nr3 = scanner.nextInt();

            int max1 = Math.max(nr1,nr2);
            System.out.println(Math.max(max1, nr3));
*/


 /*       //another
        if (num1 > num2 && num1 > num3){
            System.out.println("num1");
        }else if (num2 > num3 && num2 > num1){
            System.out.println(num2);
        }else if (num3 > num1 && num3 > num2){
            System.out.println("num3");*/
        }

        //shorter version
       // System.out.println(Math.max(Math.max(number,number2),number3));
    }
}
