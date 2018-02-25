
public class TestJob
{
   public static void main(String[] args)
   {
      // created rooms array with 4 rooms
      Room[] roomArr = { 
            new Room("A", 1, 10, true, 01),
            new Room("B", 2, 51, false, 615), 
            new Room("G", 5, 31, true, 654),
            new Room("G", 5, 31, true, 655) 
            };

      // created person array
      Person[] personArr = { new Person(roomArr[0], "2 day", "Eric"),
            new Person(roomArr[1], "3 day", "Nico") };
      // created job array
      Job[] jobArr = { new Job("Teacher", 1542132, personArr[0]),
            new Job("Student", 1542132, personArr[1]) };
      // printing out jobs from array

      // NOTE: Person toString print out only memberName
      System.out.printf(
            "Before applying givePercentageRise method the new job details are: \n%s \n %s",
            jobArr[0], jobArr[1]);

      // increasing salary by % amount
      jobArr[0].givePercentageRise(20);
      jobArr[1].givePercentageRise(100);

      // NOTE: Person toString print out only memberName
      System.out.printf(
            "After applying givePercentageRise method the new job details are: \n%s \n %s",
            jobArr[0], jobArr[1]);
   }
}
