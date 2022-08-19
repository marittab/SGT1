package basics;

public class MathClass {
    public static void main(String[] args) {

        float num = 5.455f;
        System.out.println(num);

        //Rounding down
        System.out.println(Math.floor(num));

        //Rounding up
        System.out.println(Math.ceil(num));

        //Rounding according to Math principles
        System.out.println(Math.round(num));

        //Absolute value
        System.out.println(Math.abs(num));

        //Power (kurā pakāpē kāpina skaitli)
        System.out.println(Math.pow(2.5,4));

        //Square root kvadrātsakne
        System.out.println(Math.sqrt(64));

        //Finding max value between two values
        System.out.println(Math.max(100,103.6));

        //Finding min value between two values
        System.out.println(Math.min(55, 43));

        //Random value (1-300) (pieskaita minimālo un reizina ar maksimālo)
        System.out.println((int) (Math.random() * 300) + 1);

        //Casting
        System.out.println((int)99.989);

        System.out.println((10 + 5) * 2);
    }
}
