/*Exercise 6.04
Sort numbers:
a) Write a program that asks the user to enter two numbers and prints the smallest of
the numbers.
b) Write a program that asks the user to enter two numbers and prints the numbers in
sorted order (smallest number first).
c) Write a program that asks the user to enter three numbers and prints the numbers
in sorted order (smallest number first).
d) (Optional) Write a program that asks the user to enter four numbers and prints the
numbers in sorted order (largest number first). 
*/
package Ex604;

//contains most methods to modify arrays
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex604
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Input please");
      // NOTE: creating an array using user input (3 inputs)
      Double[] numberArr = { keyboard.nextDouble(), keyboard.nextDouble(),
            keyboard.nextDouble() };

      // closing scanner
      keyboard.close();

      // sorting the array
      Arrays.sort(numberArr);

      // printing last element of array
      System.out.println(numberArr[numberArr.length - 1]);

      // printing all array after it was sorted
      System.out.println(Arrays.toString(numberArr));

      // sorting array in reverse order
      Arrays.sort(numberArr, Collections.reverseOrder());

      // printing all array elements after reverse
      System.out.println(Arrays.toString(numberArr));
   }
}
