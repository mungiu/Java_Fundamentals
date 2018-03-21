package Ex1701;

public class TestGradeList
{
    public static void main(String[] args)
    {

	Grade grade1 = new Grade("Math", 12);
	Grade grade2 = new Grade("Math", 12);
	Grade grade3 = new Grade("Math", 12);
	Grade grade4 = new Grade("Java", 12);
	Grade grade5 = new Grade("Java", 12);
	Grade grade6 = new Grade("Java", 12);
	Grade grade7 = new Grade("Java", 12);

	GradeList gradeList = new GradeList(grade1, grade2, grade3, grade4, grade5, grade6, grade7);

	System.out.println(gradeList);
    }
}
