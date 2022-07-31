package homework;

import java.util.Arrays;

public class HW7CopyanArray {
    public static void main(String[] args) {

    int [] numb = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Source Array: " + Arrays.toString(numb));

    int [] newnumb = new int [numb.length];

        for (int i = 0; i < numb.length; i++) {
            newnumb[i] = numb[i];

        }
        System.out.println("New Array: " + Arrays.toString(newnumb));



    }
}
