package Ex2003;

public class TestForAllClasses
{
	public static void main(String[] args)
	{
		Customer and1 = new Customer("Andrei", "Teodorovici", "744792", "666", false);
		PreferedCustomer pref1 = new PreferedCustomer(and1.getName(), and1.getAddress(), and1.getTelephoneNumber(),
				and1.getCustomerNumber(), false, 1575);
		pref1.setPurchaseAmount(10000);
		System.out.println(and1);
		System.out.println(pref1);
	}
}
