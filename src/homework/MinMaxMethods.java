package homework;

import java.util.Arrays;

public class MinMaxMethods {
    public static void main(String[] args) {

        int [] my_array = {10,245,777,287,165,999,14,26,2};
        System.out.println("original arrays: " + Arrays.toString(my_array));
        System.out.println("Maximum value for the above array: " + maxValue(my_array));
        System.out.println("Minimum value for the above array: " + minValue(my_array));

    }
    public static int maxValue (int [] my_array){
        int max = my_array[0];
        for (int i = 0; i< my_array.length; i++) {

        if (my_array[i] > max ){
            max = my_array[i];
            }
        }
        return max;
    }
    public static int minValue (int [] my_array){
        int min = my_array[0];
        for (int i=0; i < my_array.length; i++){
            if (my_array[i] < min){
                min = my_array[i];
            }
        }
        return min;
    }
}
