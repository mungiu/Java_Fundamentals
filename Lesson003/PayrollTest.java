import java.util.Scanner;

public class PayrollTest
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Payroll test = new Payroll();
		keyboard.close();
		
		System.out.print("Please enter your name: ");
		test.setName(keyboard.next());
		System.out.print("Please enter your payrate: ");
		test.setPayrate(keyboard.nextDouble());
		System.out.print("Please enter the hours you have worked: ");
		test.setWorkHours(keyboard.nextDouble());

		System.out.println(test.getName() + ", you have earned a total of " + test.grossPay());
	}
}
