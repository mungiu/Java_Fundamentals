package Test_3;

import java.util.ArrayList;

public class StudentList
{
	private int size;
	ArrayList<Student> list = new ArrayList<Student>();

	public void addStudent(Student student)
	{
		list.add(student);
	}

	public Student getStudent(int index)
	{
		return list.get(index);
	}

	public void removeStudent(Student student)
	{
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).equals(student))
				list.remove(i);
	}

	public int getNumberOfStudent()
	{
		return list.size();
	}

	public int getNumberOfStudentsByEducation(Education education)
	{
		int count = 0;
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getEducation().equals(education))
				count++;

		return count;
	}

	public Student[] getStudentsByEducation(Education education)
	{
		Student[] tempArr;
		int count = 0;

		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getEducation().equals(education))
				count++;

		tempArr = new Student[count];

		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getEducation().equals(education))
				tempArr[i] = list.get(i);

		return tempArr;
	}

	public int getNumberOfHighSchoolStudents()
	{
		int count = 0;
		for (int i = 0; i < list.size(); i++)
			if (((School) list.get(i).getEducation()).getSchoolType().equals("High school"))
				count++;

		return count;
	}

	public void doubleTheListCapacity()
	{
		ArrayList<Student> tempList = new ArrayList<Student>(list.size() * 2);

		for (int i = 0; i < list.size(); i++)
			tempList.add(list.get(i));

		list = tempList;
	}
}
