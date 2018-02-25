
public class Student
{
   Student()
   {
   }

   Student(String name, char gender)
   {
      this.name = name;
      this.gender = gender;
   }

   Student(String name, char gender, int studentNumber)
   {
      this.name = name;
      this.gender = gender;
      this.studentNumber = studentNumber;
   }

   String name;
   char gender;
   int studentNumber = 0;

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public char getGender()
   {
      return gender;
   }

   public void setGender(char gender)
   {
      this.gender = gender;
   }

   public int getStudentNumber()
   {
      return studentNumber;
   }

   public void setStudentNumber(int studentNumber)
   {
      this.studentNumber = studentNumber;
   }

   @Override
   public String toString()
   {
      return "Student [name=" + name + ", gender=" + gender + ", studentNumber="
            + studentNumber + "]";
   }
}
