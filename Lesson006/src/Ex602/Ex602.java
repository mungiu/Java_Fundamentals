/*
 * Write a program that reads a gender (char 'M' or 'F') and an age (int) from the keyboard
and then prints a message (Hint: for some reason there is no nextChar() method when
using a Scanner object, so first read a String with the nextLine() method and then use
charAt(0) on the String to extract the first char).
The message should depend on the typed values, in the following way:
• If gender is not either 'M' or 'F' or age is less than 0 display the message: "Error in
typed values".
• If gender is 'M' and age is less than 18 display the message: "Boy".
• If gender is 'M' and age is greater than or equal to 18 display the message: "Man".
• If gender is 'F' and age is less than 18, display the message: "Girl".
• If gender is 'F' and age is greater than or equal to 18 display the message:
"Woman".
As in the first exercise, test the program by running it multiple times and entering
different values. 
*/
package Ex602;

import java.util.Scanner;

public class Ex602
{
   public static void main(String[] main)
   {
      Scanner keyboard = new Scanner(System.in);
      // NOTE char extraction from string input and assignment to char variable
      char gender = keyboard.nextLine().charAt(0);
      int age = keyboard.nextInt();
      keyboard.close();

      if (gender != 'M' || gender != 'F')
         System.out.println("Error in value type");
      else if (gender == 'M' && age < 0)
         System.out.println("Boy");
      else if (gender == 'M' && age >= 18)
         System.out.println("Man");
      else if (gender == 'F' && age < 0)
         System.out.println("Girl");
      else if (gender == 'F' && age >= 18)
         System.out.println("Woman");
   }
}
