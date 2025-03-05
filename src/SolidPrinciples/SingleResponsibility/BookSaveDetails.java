package SolidPrinciples.SingleResponsibility;

public class BookSaveDetails {
    public static void saveDetails(Book book){
        System.out.println("\nSave Book Details\nTitle: " +book.getTitle()+"\nAuthor: "+ book.getAuthor()+"\nPrice: "+book.getPrice());
    }
}
