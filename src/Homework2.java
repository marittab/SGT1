import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter speed in mp/h");
        float speed = scanner.nextFloat();
        float speed2 = speed * 1.6f;
        System.out.println(speed + " mp/h in km/h would be equal to " + speed2 + " km/h");
    }
}
