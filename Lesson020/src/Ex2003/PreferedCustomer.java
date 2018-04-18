package Ex2003;

public class PreferedCustomer extends Customer
{
	private int purchaseAmount = 0;
	private int discountPercent = 0;

	public PreferedCustomer(String name, String address, String telephoneNumber, String customerNumber,
			boolean contactByEmail, int purchaseAmount)
	{
		super(name, address, telephoneNumber, customerNumber, contactByEmail);
		this.purchaseAmount = purchaseAmount;

		setDiscount();
	}

	public void setDiscount()
	{
		if (purchaseAmount >= 2000)
			discountPercent = 10;
		else if (purchaseAmount >= 1500)
			discountPercent = 7;
		else if (purchaseAmount >= 1000)
			discountPercent = 6;
		else if (purchaseAmount >= 500)
			discountPercent = 5;
	}

	public int getPurchaseAmount()
	{
		return purchaseAmount;
	}

	public void setPurchaseAmount(int purchaseAmount)
	{
		this.purchaseAmount = purchaseAmount;
	}

	public int getDiscountPercent()
	{
		return discountPercent;
	}

	public void setDiscountPercent(int discountPercent)
	{
		this.discountPercent = discountPercent;
	}

	@Override
	public String toString()
	{
		return super.toString() + " --- PreferedCustomer [purchaseAmount=" + purchaseAmount + ", discountPercent="
				+ discountPercent + "]";
	}

}
