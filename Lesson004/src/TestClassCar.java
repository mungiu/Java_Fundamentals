import java.util.Scanner;

public class TestClassCar
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      System.out.println(
            "Please input make, year model and speed separated by \"Enter\" key");
      String make = keyboard.nextLine();
      int yearModel = keyboard.nextInt();
      int speed = keyboard.nextInt();

      keyboard.close();

      Car Car1 = new Car(yearModel, make, speed);

      // toString overridden inside Mercedes class
      System.out.println(Car1);

      Car1.Break();
      Car1.Accelerator();
      Car1.Break();
      
      System.out.printf("The current car speed is: %d", Car1.getSpeed());
   }
}
