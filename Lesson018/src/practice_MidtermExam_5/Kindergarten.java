package practice_MidtermExam_5;

import java.util.ArrayList;

public class Kindergarten
{
	private int countTeachers = 0;
	private ArrayList<Child> children;

	public Kindergarten()
	{
		children = new ArrayList<Child>();
	}

	public void addChild(Child child)
	{
		children.add(child);
	}

	public void removeChild(Child child)
	{
		for (int i = 0; i < children.size(); i++)
			if (children.get(i) == child)
				children.remove(child);
	}

	public void hireTeachers(int count)
	{
		countTeachers += count;
	}

	public void fireTeacher()
	{
		countTeachers--;
	}

	public int countChildren()
	{
		return children.size();
	}

	public double getAverageChildAge()
	{
		// total age / # children
		double totalAge = 0;
		for (int i = 0; i < children.size(); i++)
			if (children.get(i) != null)
				totalAge += children.get(i).getAge();

		return totalAge / children.size();
	}

	public double getNorm()
	{
		// nr children per teacher
		// total children / total teachers
		return children.size() / countTeachers;
	}

	public void celebrateBirthday(String name)
	{
		for (int i = 0; i < children.size(); i++)
			if (children.get(i).getName() == name)
				System.out.println("Happy birthday: " + children.get(i).getName());
			else
				System.out.println(name + "'s birthday is not today.");
	}

	@Override
	public String toString()
	{
		return "There are " + children.size() + " children and " + countTeachers + " teachers";
	}
}
