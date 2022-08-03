public class StringExamples {
    public static void main(String[] args) {

        String text1 = "This is text example";
        String text2 = text1.intern();
        System.out.println(text2);

        //Concatenation of Strings

        String input1 = "This is ";
        String input2 = "input text";

        String inputCombined = input1.concat(input2);
        System.out.println(inputCombined);

        //To check if the two Strings are identical
        String val1 = "Text to campare";
        String val2 = "Text to camparer";
        System.out.println(val1.equals(val2));
        System.out.println(val2.equals(val1));

        //String class methods

        String inputText = "This is my text";

        //length
        System.out.println(inputText.length());

        //To uppercase
        System.out.println(inputText.toUpperCase());
        System.out.println(inputText);

        //To lowercase
        System.out.println(inputText.toLowerCase());

        //String class methods - indexOf()
        String speakingtext = "This is test value";
        System.out.println(speakingtext.indexOf('e'));//kurš simbols pēc kārtas, sāk ar 0
        System.out.println(speakingtext.indexOf(" test "));

        //String class methods - replaceAll()
        //Šūdas

        String textforTV = "This phone is complete šūdas. And this case also is šūdas";
        System.out.println(text1.replaceAll("šūdas", "Š***s"));

        //Character index
        System.out.println(textforTV.charAt(textforTV.length()-1));

        //Substring
        System.out.println(textforTV.substring(5));
        System.out.println(textforTV.substring(5,12));

        //Parsing
        //Converting String to primitive Data type

       String intValue = "160";
       String floatValue = "2.0";
       String doubleValue = "2.3535364758";
       String boolValue = "true";
       String longValue = "10000000000000";


        System.out.println(Integer.parseInt(intValue)+4);
        System.out.println(Float.parseFloat(floatValue));
        System.out.println(Double.parseDouble(doubleValue));
        System.out.println(Boolean.parseBoolean(boolValue));
        System.out.println(Long.parseLong(longValue));
    }
}
