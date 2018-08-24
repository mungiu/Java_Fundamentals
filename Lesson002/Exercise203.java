import java.util.Scanner;

public class Exercise203
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int item1 = 80;
		int item2 = 140;
		int item3 = 230;
		System.out.print("Please enter the amount of sales tax in your country (in %): ");
		s.close();
		
		double salesTax = (s.nextDouble() / 100) + 1;
		System.out.println(salesTax);
		System.out.println("Standard prices: \n" + item1 + "\n" + item2 + "\n" + item3);
		System.out.println(
				"Prices including tax:\n" + item1 * salesTax + "\n" + item2 * salesTax + "\n" + item3 * salesTax);
	}
}
