package homework;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basics.Input tree size");
        int input = scanner.nextInt();

        //Each level
        for(int i = 0; i < input; i++) {

            //spaces
            for(int j = 0; j < input - 1 - i; j++) {
                System.out.print(" ");
            }

            //Stars
            for(int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }

            //spaces not necessary, because the picture is the same as without
            for(int j = 0; j < input - 1 - i; j++) {
                System.out.print(" ");
            }
            // Move to next line
            System.out.println();
        }
        // Base level
        for(int i = 0; i < input - 1; i++){
            System.out.print(" ");
        }
        System.out.println("#");


        //My homework
        /*for (int i = 1; i <= input; i++) {
            for (int space = 1; space <= input - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i * 2 - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i ==1; i++) {
            for (int space = 1; space <= input - i; space++) {
                System.out.print(" ");

            }
            for (int leg = 1; leg == 1; leg++) {
                System.out.println("#");
            }
        }*/





    }
}
