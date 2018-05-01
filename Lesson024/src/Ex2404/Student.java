package Ex2404;

import java.io.Serializable;

// serializable allows object to be written to binary files
public class Student implements Serializable
{
	private String firstName;
	private String lastName;
	private String country;

	public Student(String firstName, String lastName, String country)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
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

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	@Override
	public String toString()
	{
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country + "]";
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Student))
			return false;
		else
		{
			Student temp = (Student) obj;
			return (temp.country == country && temp.firstName == firstName && temp.lastName == lastName);
		}
	}
}
