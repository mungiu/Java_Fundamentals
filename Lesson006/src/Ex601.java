
/*
 * Write a program that reads an age (int) from the keyboard and then prints a message. The
message should depend on the typed value in the following way:
• If the age is less than 0 display the message: "Error in age value".
• If the age is between 0 and 12 (both included) display the message: "Child".
• If the age is between 13 and 19 (both included) display the message: "Teenager".
• If the age is between 20 and 65 (both included) display the message: "Adult".
• If the age is larger than 65 display the message: "Senior citizen".
Test the program by running it at least 5 times to be sure that it will print out the correct
message for each age group. 
*/

import java.util.Scanner;

public class Ex601
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Input int:");
      int intInput = keyboard.nextInt();
      keyboard.close();

      if (intInput < 0)
         System.out.println("Error in age value");
      else if (intInput <= 12)
         System.out.println("Child");
      else if (intInput <= 19)
         System.out.println("Teenager");
      else if (intInput <= 65)
         System.out.println("Adult");
      else if (intInput > 65)
         System.out.println("Senior citizen");

   }
}
