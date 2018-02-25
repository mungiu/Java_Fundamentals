import java.util.Scanner;

public class TestClassBook
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      System.out.println(
            "Input Author name, Book name, Price and Number of pages separated by \"Enter\" key.");

      String authorName = keyboard.nextLine();
      String bookName = keyboard.nextLine();
      float price = keyboard.nextFloat();
      int pages = keyboard.nextInt();

      //combating problem int to string Read
      keyboard.nextLine();
      
      // book from user inputs
      Book a1 = new Book(authorName, bookName, price, pages);
      // hard coded book
      Book a2 = new Book("Satoshy Nakamoto", "Bitcoin", 8750, 21000000);
      // book from user inputs "ALL INSIDE"
      Book a3 = new Book(keyboard.nextLine(), // reading author name
            keyboard.nextLine(), // reading book name
            keyboard.nextFloat(), // reading book price
            keyboard.nextInt()); // reading book page number

      keyboard.close();

      // toString overriden inside Book class
      System.out.println(a1);
      System.out.println(a2);
      System.out.println(a3);
   }
}
