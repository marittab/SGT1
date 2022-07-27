public class NumberGrid {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){ //cik elementu ir konkrētā rindā
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int [] tempArray : array) {
            for (int arrays : tempArray) {
                System.out.print(arrays + " ");
            }
            System.out.println();
        }
    }
}