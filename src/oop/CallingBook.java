package oop;

public class CallingBook {
    public static void main(String[] args) {

        //Creating Book class objects
        Book book1 = new Book();
        book1.printBookInfo();


        book1.setTitle("Test title");
        book1.setAuthor("test Author");
        book1.setNumberOfPages(5);

        book1.printBookInfo();


        Book book2 = new Book();
        book2.setAuthor("Unknown");
        book2.setTitle("Book 2");
        book2.setNumberOfPages(300);

        book2.printBookInfo();

    }
}
