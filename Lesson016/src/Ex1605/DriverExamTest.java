package Ex1605;

import java.util.Scanner;

public class DriverExamTest
{
    public static void main(String[] args)
    {
	Scanner keyboard = new Scanner(System.in);
	DriverExam exam1 = new DriverExam();

	System.out.println("Input 20 answeres, if no answer press space once and then press enter.");

	for (int i = 0; i < 20; i++)
	    exam1.addAnswer(keyboard.nextLine());
	keyboard.close();

	// return results from driver class methods
	System.out.println(exam1.questionsMissed());
	System.out.println(exam1.totalIncorrect());
	System.out.println(exam1.totalCorrect());
	System.out.println(exam1.passed());
    }
}
