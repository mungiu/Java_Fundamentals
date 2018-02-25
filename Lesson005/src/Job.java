
public class Job extends Person
{
   Job()
   {
   }

   Job(String jobTitle, double monthlySalary)
   {
      this.person = null;
      this.monthlySalary = monthlySalary;
      this.jobTitle = jobTitle;
   }

   Job(String jobTitle, double monthlySalary, Person person)
   {
      this.person = person;
      this.monthlySalary = monthlySalary;
      this.jobTitle = jobTitle;
   }

   String jobTitle;
   double monthlySalary;
   Person person;

   /*Increasing monthlySalary by X%*/
   public void givePercentageRise(double percentage)
   {
      monthlySalary += monthlySalary / 100 * percentage;
   }

   public String getJobTitle()
   {
      return jobTitle;
   }

   public void setJobTitle(String jobTitle)
   {
      this.jobTitle = jobTitle;
   }

   public double getMonthlySalary()
   {
      return monthlySalary;
   }

   public void setMonthlySalary(double monthlySalary)
   {
      this.monthlySalary = monthlySalary;
   }

   public Person getPerson()
   {
      return person;
   }

   public void setPerson(Person person)
   {
      this.person = person;
   }

   @Override
   public String toString()
   {
      return "Job [jobTitle=" + jobTitle + ", monthlySalary=" + monthlySalary
            + ", person=" + person + "]";
   }
}
