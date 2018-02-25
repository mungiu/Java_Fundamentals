
public class TestClassStudent
{
   public static void main(String[] args)
   {
      Student Andrei = new Student("Andrei Mungiu", 'M', 273473);
      Student Erik = new Student("Erik Volmer", 'M', 273448);
      Student Ron = new Student("Ron", 'M');
      Student Mihai = new Student("238971", 'M', 238971);
      
      System.out.printf("Andreis' gender is: %s\n", Andrei.getGender());
      
      //changing name
      Erik.setName("Good Guy");
      
      System.out.printf("Eriks name is: %s\n", Erik.getName());
      System.out.printf("Ron's stundet number is: %d\n", Ron.getStudentNumber());
      
      //NOTE: toString method was overridden in "Student" class
      System.out.println(Mihai);
      
   }
}
