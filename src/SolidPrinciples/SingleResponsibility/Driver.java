package SolidPrinciples.SingleResponsibility;

public class Driver {
    public static void main(String[] args) {
       Book book =new Book("Gitanjali","Rabindranath Tagore",200);
       BookDisplayInfo.displayInfo(book);
        BookSaveDetails.saveDetails(book);
    }
}
