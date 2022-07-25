public class ArrayExamples {
    public static void main(String[] args) {

        //Declare Array that will hold  3 String type variables
        String [] names = new String[3];

        //How to set array's element values
        names[0] = "Marita";
        names [1] = "Juris";
        names [2] = "Pēteris";

        //How to get array's elements value
        System.out.println(names[2] );


        int[] grades = new int[10];
        grades[0] = 10;
        grades[1] = 10;
        grades[2] = 4;
        grades[3] = 10;
        grades[4] = 3;
        grades[5] = 10;
        grades[6] = 10;
        grades[7] = 8;
        grades[8] = 10;
        grades[9] = 9;

        //How to get Array's size
        System.out.println("Array's size: " + grades.length);

        //Print out all elements
        for (int i = 0; i < grades.length; i++){
            System.out.print(grades[i] + " ");
        }


    }
}
