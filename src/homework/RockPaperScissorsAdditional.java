package homework;

import java.util.Scanner;

public class RockPaperScissorsAdditional {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char runAgain = 'y';

        while (runAgain == 'y') {
            System.out.println("Please enter Player's 1 choice (rock, paper, scissors, lizard, spock)");
            String Player1 = scanner.nextLine().trim().toLowerCase().replaceAll(" ", "");
            System.out.println("Please enter Player's 2 choice (rock, paper, scissors, lizard, spock)");
            String Player2 = scanner.nextLine().trim().toLowerCase().replaceAll(" ", "");


            rockPaperScissors(Player1,Player2);


            System.out.println("Do you want to play again? y/n");
            runAgain = scanner.next().charAt(0);
            scanner.nextLine();
        }
    }


    public static void rockPaperScissors(String Player1, String Player2){
         if(Player1.equals(Player2)) {
            System.out.println("It's a tie");
             } else if (Player1.equals("paper") && Player2.equals("rock")
                || Player1.equals("paper") && Player2.equals("spock")
                || Player1.equals("lizard") && Player2.equals("paper")
                || Player1.equals("lizard") && Player2.equals("spock")
                || Player1.equals("spock") && Player2.equals("rock")
                || Player1.equals("spock") && Player2.equals("scissors")
                || Player1.equals("scissors") && Player2.equals("paper")
                || Player1.equals("scissors") && Player2.equals("lizard")
                || Player1.equals("rock") && Player2.equals("scissors")
                || Player1.equals("rock") && Player2.equals("lizard"))
             {
            System.out.println("Player 1 wins");
            } else if (Player2.equals("paper") && Player1.equals("rock")
                 || Player2.equals("paper") && Player1.equals("spock")
                 || Player2.equals("lizard") && Player1.equals("paper")
                 || Player2.equals("lizard") && Player1.equals("spock")
                 || Player2.equals("spock") && Player1.equals("rock")
                 || Player2.equals("spock") && Player1.equals("scissors")
                 || Player2.equals("scissors") && Player1.equals("paper")
                 || Player2.equals("scissors") && Player1.equals("lizard")
                 || Player2.equals("rock") && Player1.equals("scissors")
                 || Player2.equals("rock") && Player1.equals("lizard"))
            System.out.println("Player 2 wins");
            }


    }


