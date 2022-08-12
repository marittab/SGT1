public class Methods {
    public static void main(String[] args) {

        printName("Marita");

        String introText = returnName("Bob");

        System.out.println(introText);

        System.out.println(returnName("John"));

        personInfo("Marita", 37);
        personInfo("Yoyo", 35);

        int calculation = sum(45,66,12);
        if(calculation>-100){
            System.out.println("over 100");
        }else{
            System.out.println("under 100");
        }




    }

    public static void printName(String name ){

        System.out.println("Hello your name is " + name);
    }

    public static String returnName (String name){
        System.out.println(" ----- Inside returnName method ----");
        return "Hello your name is " + name;
    }

    public static void personInfo (String name, int age){
        System.out.printf("Your name is %s and you are %d years old\n", name, age);

    }

    public static int sum (int num1, int num2, int num3){

        return num1 + num2 + num3;
    }


}
