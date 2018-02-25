/*
 * 
 * */

package Ex606;

import java.util.Scanner;

public class Ex606
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      double a = keyboard.nextDouble();
      double b = keyboard.nextDouble();
      double c = keyboard.nextDouble();
      
      double D = Math.pow(b, 2) - 4 * a * c;
      double x1;
      double x2;
      
      keyboard.close();

      if (D < 0)
         System.out.println("No solution (no x)");
      else if (D == 0)
      {
         x1 = -(b / 2 * a);
         System.out.printf("Solution (x) is: %.02d", x1);
      }
      else if (D > 0)
      {
         x1 = (-b + Math.sqrt(D)) / 2 * a;
         x2 = (-b - Math.sqrt(D)) / 2 * a;
         System.out.printf("Solution (x1 and x2) are: \n%f and \n%f", x1, x2);
      }
   }
}
