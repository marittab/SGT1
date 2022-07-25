package homework;

import java.util.Arrays;
import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the required size of the array");
        int arrays = scanner.nextInt();
        float[] numbers = new float[arrays];
        float sum = 0;

        System.out.println("Enter the elements of the array one by one");

        for(int i = 0; i < arrays; i++){
            System.out.println("Please enter element number: " + (i+1));
            numbers[i] = scanner.nextInt();
            sum += numbers[i];

        }
        System.out.print("Source Array: ");
        for(int i = 0; i < arrays; i++) {
            System.out.print(numbers[i] + " ");
        }

        /*System.out.println("Enter the elements of the array one by one");

        int i = 1;
        do {
            System.out.println("Please enter element number: " + i);
            int numbers  = scanner.nextInt();
            i++;
        }while (i <= arrays);



        System.out.print("Source Array: " );
        for (int n = 0; n < numbers.length; n++) {
            System.out.print(numbers[n] + " ");

        }*/
        System.out.println();

        //Printing out all array's elements using For-each loop
        System.out.print("Source Array: ");
        for(float temp : numbers){
            System.out.print(temp + " ");
        }
        System.out.println();
        System.out.println("sum of all elements : " + sum);

        System.out.println("Average grade: " + sum/numbers.length);
        System.out.println("There was passed " + numbers.length + " values");


        //Summ
        //System.out.println("Sum of all elements: " + Arrays.stream(numbers).sum());


    }
}
