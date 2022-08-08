import java.util.Scanner;

public class StringInputPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name and age (John 30)");

        //Read string from user and get rid of space (trim)
        //Get substring of last two characters in the string
        //Convert those to integer
        //If age is over 70 then print "Senior" if not then "Adult"

        String input = scanner.nextLine().trim();
        int age = Integer.parseInt(input.substring(input.length()-2));

        if (age > 70){
            System.out.println("Senior");
        } else {
            System.out.println("Adult");
        }
    }
}
