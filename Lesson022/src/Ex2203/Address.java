package Ex2203;

public class Address
{
	private String street;
	private String number;
	private String postalCode;
	private String city;
	private String country;

	public Address(String st, String no, String pc, String ci, String co)
	{
		this.street = st;
		this.number = no;
		this.postalCode = pc;
		this.city = ci;
		this.country = co;
	}

	public void setAddress(String st, String no, String pc, String ci, String co)
	{
		this.street = st;
		this.number = no;
		this.postalCode = pc;
		this.city = ci;
		this.country = co;
	}

	public String getStreet()
	{
		return this.street;
	}

	public void setStreet(String street)
	{
		this.street = street;
	}

	public String getNumber()
	{
		return this.number;
	}

	public void setNumber(String number)
	{
		this.number = number;
	}

	public String getPostalCode()
	{
		return this.postalCode;
	}

	public void setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
	}

	public String getCity()
	{
		return this.city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getCountry()
	{
		return this.country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	@Override
	public String toString()
	{
		return "Street: " + street + ", Number: " + number + ", Postal code: " + postalCode + ", City: " + city
				+ ", Country: " + country;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Address))
			return false;
		else
		{
			Address _address = (Address) obj;
			return (this.street == _address.street && this.number == _address.number
					&& this.postalCode == _address.postalCode && this.country == _address.country);
		}
	}
}
