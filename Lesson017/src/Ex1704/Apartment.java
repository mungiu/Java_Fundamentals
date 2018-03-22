package Ex1704;

public class Apartment
{
	private Tenant tenant;
	private String address;
	private double rent;

	public Apartment(String address, double rent)
	{
		this.address = address;
		this.rent = rent;
		this.tenant = null;
	}

	public String getAddress()
	{
		return this.address;
	}

	public void setRent(double rent)
	{
		this.rent = rent;
	}

	public double getRent()
	{
		return this.rent;
	}

	public void rentTo(String name, String phone)
	{
		if (tenant.getName() == null && tenant.getPhone() == null)
			tenant = new Tenant(name, phone);
	}

	public void evict()
	{
		tenant.setName(null);
		tenant.setPhone(null);
		tenant.setRentDue(0);
	}

	public boolean isOccupied()
	{
		return (tenant.getName() != null && tenant.getPhone() != null);
	}

	public Tenant getTenant()
	{
		if (isOccupied())
			return tenant.copy();
		else
			return null;
	}

	public double getRentDue()
	{
		if (isOccupied())
			return tenant.getRentDue();
		else
		{
			System.out.println("The apartment is not occupied, rent due is \"0\"");
			return 0;
		}
	}

	public void chargeRent()
	{
		if (isOccupied())
			tenant.setRentDue(tenant.getRentDue() + rent);
		else
			System.out.println("Nobody lives here, you can't charge anybody rent.");
	}

	public void collectRent(double amount)
	{
		if (isOccupied())
			tenant.setRentDue(tenant.getRentDue() - amount);
		else
			System.out.println("Nobody lives here, there is no money to collect.");
	}

	@Override
	public String toString()
	{
		if (isOccupied())
			return "Address is: " + address + " and rent is: " + rent;
		else
			return "No tenant in here";
	}
}
