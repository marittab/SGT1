package homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonalNo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char runAgain = 'y';

        while (runAgain =='y'){
            System.out.println("Enter your personal number");
            String input = scanner.nextLine();

            Pattern pattern = Pattern.compile("[0-9]{6}?-[0-9]{5}");
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
                System.out.println("Your inputted personal number is valid");
            }else {
                System.out.println("Your inputted personal number is not valid");
            }
            System.out.println("Do you want to check your personal number again? y/n");
            runAgain = scanner.next().charAt(0);
            scanner.nextLine();
        }

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your personal number");
        String personalNumber = scanner.nextLine().trim();
        Pattern pattern = Pattern.compile("[0-9]{6}-[0-9]{5}");
        Matcher matcher1 = pattern.matcher(personalNumber);
        boolean correctNumber = matcher1.matches();

        if(correctNumber){
            System.out.println("Your inputted personal number is valid");
        }else{
            System.out.println("Your inputted personal number is not valid");

        }
        System.out.println("Do you want to check your personal number again? y/n");
        String input = scanner.nextLine();
        Pattern pattern2 = Pattern.compile("[y]{1}");
        Matcher matcher2 = pattern2.matcher(input);
        boolean onemoretime = matcher2.matches();

        while (onemoretime) {
            System.out.println("Enter your personal number");
            personalNumber = scanner.nextLine().trim();
            pattern = Pattern.compile("[0-9]{6}-[0-9]{5}");
            matcher1 = pattern.matcher(personalNumber);
            correctNumber = matcher1.matches();

            if (correctNumber) {
                System.out.println("Your inputted personal number is valid");
            } else {
                System.out.println("Your inputted personal number is not valid");
            }
            System.out.println("Do you want to check your personal number again? y/n");
            input = scanner.nextLine().trim();
        }*/

    }
}
