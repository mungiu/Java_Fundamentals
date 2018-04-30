package Assignment2;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeList
{
	private int size;
	private ArrayList<Employee> employees;

	public EmployeeList(int maxNumberOfEmployees)
	{
		size = maxNumberOfEmployees;
		this.employees = new ArrayList<Employee>(size);
	}

	public void addEmployee(Employee employee)
	{
		if (employee instanceof HourlyEmployee)
			employees.add((HourlyEmployee) employee);
		if (employee instanceof SalariedEmployee)
			employees.add((SalariedEmployee) employee);
	}

	public void removeEmployee(int index)
	{
		employees.remove(index);
	}

	public int getNumberOfEmployees()
	{
		int tempCount = 0;
		for (int i = 0; i < employees.size(); i++)
			if (employees.get(i) != null)
				tempCount++;

		return tempCount;
	}

	public Employee[] getAllEmployees()
	{
		Employee[] employeesArr;
		int arraySize = 0;

		for (int i = 0; i < employees.size(); i++)
			if (employees.get(i) != null)
				arraySize++;

		employeesArr = new Employee[arraySize];

		int count = 0;
		for (int i = 0; i < employees.size(); i++)
			if (employees.get(i) != null)
			{
				employeesArr[count] = employees.get(i);
				count++;
			}

		return employeesArr;
	}

	public double getTotalEarningPerWeek()
	{
		double totalEarningsPerWeek = 0;
		for (int i = 0; i < getAllEmployees().length; i++)
			totalEarningsPerWeek += getAllEmployees()[i].earningsPerWeek();

		return totalEarningsPerWeek;
	}

	// ASK ALLAN IF CORRECT
	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof EmployeeList))
			return false;
		else
		{
			EmployeeList temp = (EmployeeList) obj;

			// using ArrayList equals method
			return (employees.equals(temp.employees) && size==temp.size);
		}
	}
}
