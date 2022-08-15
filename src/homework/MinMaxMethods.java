package homework;

import java.util.Arrays;

public class MinMaxMethods {
    public static void main(String[] args) {

        int [] my_array = {10,245,777,287,165,999,14,26,6};
        System.out.println("original arrays: " + Arrays.toString(my_array));
        System.out.println("Maximum value for the above array: " + max(my_array));
        System.out.println("Minimum value for the above array: " + min(my_array));

    }
    public static int max (int [] array){
        int max = array[0];
        for (int i = 1; i< array.length; i++) {

        if (array[i] > max ){
            max = array[i];
            }
        }
        return max;
    }
    public static int min (int [] my_array){
        int min = my_array[0];
        for (int i=1; i < my_array.length; i++){
            if (my_array[i] < min){
                min = my_array[i];
            }
        }
        return min;
    }
}
