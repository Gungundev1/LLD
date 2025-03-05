package SolidPrinciples.SingleResponsibility;

public class BookDisplayInfo {
    public static void displayInfo(Book book) {
        System.out.println("\nDisplay Info:\nTitle: " +book.getTitle()+"\nAuthor: "+ book.getAuthor()+"\nPrice: "+book.getPrice());

    }


}
