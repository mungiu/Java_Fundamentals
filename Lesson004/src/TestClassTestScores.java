import java.util.Scanner;

public class TestClassTestScores
{
   public static void main(String[] args)
   {
      Scanner key = new Scanner(System.in);

      System.out.println(
            "Please input three test scores separated by \"Enter\" keyboard:");

      TestScores Semester1 = new TestScores(key.nextDouble(), key.nextDouble(),
            key.nextDouble());
      key.close();

      System.out.printf("The average test score is: %.2f",
            Semester1.GradeAverage());
   }
}
