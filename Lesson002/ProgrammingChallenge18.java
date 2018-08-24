
public class ProgrammingChallenge18
{
	public static void main(String[] args)
	{
		System.out.println("The story about Joe's stocks.\n ");
		int stock = 1000;
		double commission = 2.0 / 100;
		double buyprice = 32.87;
		double sellprice = 33.92;
		double buy = (stock * buyprice + (stock * buyprice * commission));
		double sell = (stock * sellprice - (stock * sellprice * commission));

		System.out.println("Amount paid for the stock: " + (int) (stock * buyprice + (stock * buyprice * commission))
				+ "\nCommission paid for the purchase: " + (stock * buyprice * commission) + "\nTotal sell price: "
				+ (stock * sellprice - (stock * sellprice * commission)) + "\nCommission for the sales: "
				+ (stock * sellprice * commission) + "\nProfit/loss: " + (sell - buy));

	}
}
