import java.util.Scanner;

public class Exercise208
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print(
				"The story about Joe's stocks.\nPlease enter the following information.\n\nAmount of stocks bought/sold: ");

		int stock = s.nextInt();
		System.out.print("Commission paid in %: ");
		double commission = s.nextDouble() / 100;
		System.out.print("Buy price: ");
		double buyprice = s.nextDouble();
		System.out.print("Sell price: ");
		double sellprice = s.nextDouble();
		double buy = (stock * buyprice + (stock * buyprice * commission));
		double sell = (stock * sellprice - (stock * sellprice * commission));

		System.out.println(
				"\nBased on that input, the following calculations have been made.\n\nAmount paid for the stock: "
						+ (int) (stock * buyprice + (stock * buyprice * commission))
						+ "\nCommission paid for the purchase: " + (stock * buyprice * commission)
						+ "\nTotal sell price: " + (stock * sellprice - (stock * sellprice * commission))
						+ "\nCommission for the sales: " + (stock * sellprice * commission) + "\nProfit/loss: "
						+ (sell - buy));
		s.close();

	}
}
