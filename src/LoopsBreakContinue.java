public class LoopsBreakContinue {
    public static void main(String[] args) {

        //Break to stoop loops before the end
        for (int i = 0; i < 10; i++){
            System.out.println("Hello World!");
            if (i == 4){
                break;
            }
        }


        //continue - for skipping current iteration of loop
        for (int i = 1; i <= 10; i++){

            if (i == 4) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
}

