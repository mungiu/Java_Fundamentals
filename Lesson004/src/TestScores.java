
public class TestScores
{
   TestScores()
   {
   };

   TestScores(double gradeOne, double gradeTwo, double gradeThree)
   {
      this.gradeOne = gradeOne;
      this.gradeTwo = gradeTwo;
      this.gradeThree = gradeThree;
   };

   double gradeOne = 0;
   double gradeTwo = 0;
   double gradeThree = 0;

   public double getGradeOne()
   {
      return gradeOne;
   }

   public void setGradeOne(double gradeOne)
   {
      this.gradeOne = gradeOne;
   }

   public double getGradeTwo()
   {
      return gradeTwo;
   }

   public void setGradeTwo(double gradeTwo)
   {
      this.gradeTwo = gradeTwo;
   }

   public double getGradeThree()
   {
      return gradeThree;
   }

   public void setGradeThree(double gradeThree)
   {
      this.gradeThree = gradeThree;
   }

   /*Returns average of three grades*/
   public double GradeAverage()
   {
      return (gradeOne + gradeTwo + gradeThree) / 3;
   }
}
