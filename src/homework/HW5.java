package homework;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");


        int number = scanner.nextInt();


        while (number > 0 ) {
            System.out.print(number + " ");
            number--;
        } while (number < 1){
        System.out.print(number + " ");
        number++;
        }*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");

        int input = scanner.nextInt();

        if(input >= 0) {
            for (int i = input; i >= 0; i--){
                System.out.print(i + " ");

            }
        } else {
            for(int i = input; i <= 0; i++){
                System.out.print(i + " ");
            }
        }
        }
    }

