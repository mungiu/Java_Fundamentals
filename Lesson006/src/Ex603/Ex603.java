/*
 * Write a program that reads a grade from the Danish 7-scale from keyboard (as an int) and
prints the equivalent grade from the international grade scale.
The Danish 7-scale grades are the following: {12, 10, 7, 4, 2, 0, -3} and the international
grades are: {A, B, C, D, E, Fx, F}.
The grades are converted as: 12=A, 10=B, 7=C, 4=D, 2=E, 0=Fx and -3=F 
*/
package Ex603;

import java.util.Scanner;

public class Ex603
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int grade = keyboard.nextInt();
      keyboard.close();
      
      if (grade > 12 && grade < -3)
         System.out.println("Invalid grade");
      else if (grade == 12)
         System.out.println("A");
      else if (grade >= 10)
         System.out.println("B");
      else if (grade >= 7)
         System.out.println("C");
      else if (grade >= 4)
         System.out.println("D");
      else if (grade >= 2)
         System.out.println("E");
      else if (grade >= 0)
         System.out.println("Fx");
      else if (grade >= -3)
         System.out.println("F");
   }
}
