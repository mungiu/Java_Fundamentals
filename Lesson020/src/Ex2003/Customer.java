package Ex2003;

public class Customer extends Person
{
	private String customerNumber;
	private boolean contactByEmail;

	public Customer(String name, String address, String telephoneNumber, String customerNumber, boolean contactByEmail)
	{
		super(name, address, telephoneNumber);
		this.customerNumber = customerNumber;
		this.contactByEmail = contactByEmail;
	}

	public String getCustomerNumber()
	{
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber)
	{
		this.customerNumber = customerNumber;
	}

	public boolean isContactByEmail()
	{
		return contactByEmail;
	}

	public void setContactByEmail(boolean contactByEmail)
	{
		this.contactByEmail = contactByEmail;
	}

	@Override
	public String toString()
	{
		return super.toString() + " --- Customer [customerNumber=" + customerNumber + ", contactByEmail=" + contactByEmail
				+ "]";
	}

}
