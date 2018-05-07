package Ex2501;

import java.io.Serializable;

public class Owner implements Serializable
{
	private static final long serialVersionUID = 9021889153739599741L;
	
	private String firstName;
	private String lastName;

	public Owner(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	@Override
	public String toString()
	{
		return firstName + "," + lastName;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Owner))
			return false;
		else
		{
			Owner temp = (Owner) obj;
			return temp.firstName == firstName && temp.lastName == lastName;
		}
	}

}
