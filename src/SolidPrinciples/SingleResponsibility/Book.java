package SolidPrinciples.SingleResponsibility;

import java.util.Scanner;

public class Book {
    String title;
    String author;
  int price;

  public Book(String title, String author , int price){
      this.title=title;
      this.author=author;
      this.price=price;
  }
  public String getTitle(){
      return title;
  }
public String getAuthor(){
      return author;
}
public int getPrice(){
      return price;
}
    public static void main(String[] args) {
        Book book =new Book("Gitanjali","Rabindranath Tagore",200);
//        Scanner scanner=new Scanner(System.in);
//        book.title=scanner.next();
//        book.author=scanner.next();
//        book.price=scanner.nextInt();

        BookDisplayInfo.displayInfo(book);
        BookSaveDetails.saveDetails(book);
    }
}