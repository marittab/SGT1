package basics;

public class PrintFormating {
    public static void main(String[] args) {

        // s - string
        // d - decimal, integers
        // f - float, double
        // c - character
        // b - boolean

        String name = "Bob";
        int age  = 36;

        System.out.println("hello " + name + " Your age is " + age);
        System.out.printf("Hello %s your age is %d \n", name, age);

        System.out.printf("Hello %1$s your age is %2$d. Nice to meet you %1$s \n",name,age);

        double height = 192.3456765443;
        System.out.printf("%s is %.2f cm tall", name, height);// aiz % .2 norāda cik sim aiz komata

    }
}
