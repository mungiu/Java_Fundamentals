package Ex1301;

public class Person
{
	private String name;
	private String address;
	private MyDate birthday;

	public Person(MyDate birthday)
	{
		// NOTE: we are creating new birthday with same value
		this.birthday = birthday.copy();
		this.name = null;
		this.address = null;
	}

	public Person(String name, MyDate birthday)
	{
		this.name = name;
		this.birthday = birthday.copy();
		this.address = null;
	}

	public Person(String name, String address, MyDate birthday)
	{
		this.name = name;
		this.address = address;
		this.birthday = birthday.copy();
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return this.address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public MyDate getBirthday()
	{
		// NOTE: we are returning the value on the "birthday" and thus no allowing
		// birthday to be accessed
		return birthday.copy();
	}

	public int getAge()
	{
		if (MyDate.today().getMonth() > this.birthday.getMonth() && MyDate.today().getDay() > this.birthday.getDay())
			return MyDate.today().getYear() - this.birthday.getYear();
		else
			return MyDate.today().getYear() - this.birthday.getYear() - 1;
	}

	@Override
	public boolean equals(Object person)
	{
		if (!(person instanceof Person))
			return false;
		else
		{
			Person _person = (Person) person;
			return (this.address == _person.address && this.birthday == _person.birthday && this.name == _person.name);
		}
	}

	@Override
	public String toString()
	{
		return this.name + this.address + this.birthday;
	}
}
