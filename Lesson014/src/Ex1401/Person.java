package Ex1401;

public class Person
{
    private String name;
    private MyDate birthday;
    private Brain brain;
    private Address address;

    public Person(MyDate birthday)
    {
	// NOTE: we are creating new birthday with same value
	this.birthday = birthday.copy();
	this.name = null;
	this.address = null;
	brain = new Brain(3);
    }

    public Person(String name, MyDate birthday)
    {
	this.name = name;
	this.birthday = birthday.copy();
	this.address = null;
	brain = new Brain(3);
    }

    public Person(String name, Address address, MyDate birthday)
    {
	this.name = name;
	this.address = address;
	this.birthday = birthday.copy();
	brain = new Brain(3);
    }

    public String getShortAddress()
    {
	return "Street: " + this.address.getStreet() + ", Number: " + this.address.getNumber();
    }

    public boolean isBrainDamaged()
    {
	return this.brain.isBrainDamaged();
    }

    public boolean doYouRemember(String info)
    {
	return brain.recall(info);
    }

    public void rememberThis(String info)
    {
	if (brain.recall(info))
	    brain.remember(info);
	else
	    brain.refreshMemory(info);
    }

    /** Retrieves active memory from brain */
    public String whatAreYouThinkingAbout()
    {
	return brain.recall();
    }

    public String getName()
    {
	return this.name;
    }

    public void setName(String name)
    {
	this.name = name;
    }

    public Address getAddress()
    {
	return this.address;
    }

    public void setAddress(Address address)
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

    public int getIq()
    {
	return brain.getIQ();
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
