package Assignment2;

public class Main
{
	public static void main(String[] args)
	{
		EmployeeList list1 = new EmployeeList(10);
		EmployeeList list2 = new EmployeeList(10);

		Date date1 = new Date(23, 2, 1990);
		Date date2 = new Date(26, 9, 1995);

		HourlyEmployee he1 = new HourlyEmployee("Andrei Mungiu", date1, 190, 37);
		SalariedEmployee se1 = new SalariedEmployee("Valeria Valac", date2, 5000);
		
		list1.addEmployee(he1);
		list1.addEmployee(se1);
		
		list2.addEmployee(he1);
		list2.addEmployee(se1);
		
		System.out.println(list1.equals(list2));
	}
}
