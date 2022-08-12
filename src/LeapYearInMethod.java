import java.util.Scanner;

public class LeapYearInMethod {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any year");
        year = scanner.nextInt();

        determinLeapYear(year);

        System.out.println(determinLeapYear1(year));

    }
    public static void determinLeapYear ( int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
    public static String determinLeapYear1 ( int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        return year + " is a leap year";
        } else {
            return year + " is not a leap year";
        }
    }
}
