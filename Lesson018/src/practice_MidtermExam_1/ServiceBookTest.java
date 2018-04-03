package practice_MidtermExam_1;

public class ServiceBookTest
{
	public static void main(String[] args)
	{
		ServiceBook book1 = new ServiceBook();
		ServiceBook book2 = new ServiceBook();

		Date d1 = new Date(23, 02, 1990);
		Date d2 = new Date(26, 02, 1990);

		Service s1 = new Service(1000, d1);
		Service s2 = new Service(10000, d2);

		book1.addService(s1);
		book1.addService(s2);
		book2.addService(s1);
		book2.addService(s2);

		System.out.println(book1.equals(book2));
		System.out.println(s1.equals(s2));
		System.out.println(d1.equals(d2));
		
		
		Service[] s = book1.getAllServices();
		Date d4 = book1.getDateOfLastService();
	}
}
