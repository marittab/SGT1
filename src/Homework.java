import java.time.LocalDate;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Please enter your date of birth");
        int year = scanner.nextInt();
        int age = 2022 - year;

        System.out.println("Your name is " + name + " and you are " + age + " years old");

    }
}
