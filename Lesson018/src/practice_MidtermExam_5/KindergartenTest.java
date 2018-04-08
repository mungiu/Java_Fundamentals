package practice_MidtermExam_5;

public class KindergartenTest
{
	public static void main(String[] args)
	{
		Kindergarten kg1 = new Kindergarten();
		Child ch1 = new Child("Andrei", 27);
		Child ch2 = new Child("Valeria", 21);
		
		ch2 = ch1;

		kg1.addChild(ch1);
		kg1.addChild(ch2);

		System.out.println(kg1);
		System.out.println(ch1.equals(ch2));
	}
}
