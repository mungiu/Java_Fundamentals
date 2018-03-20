package Ex1601;

public class GradeListTest
{
    public static void main(String[] args)
    {
	Grade java = new Grade("Java", 7);
	Grade math = new Grade("Math", 12);
	Grade rwd = new Grade("RWD", 10);

	GradeList grades = new GradeList(10);
	grades.setGrade(java, 0);
	grades.setGrade(math, 1);
	grades.setGrade(rwd, 2);
	

	GradeList grades2 = new GradeList(10);
	grades2.setGrade(java, 0);
	grades2.setGrade(math, 2);
	grades2.setGrade(rwd, 1);

	GradeList grades3 = grades;

	System.out.println(grades.getAverage());
	System.out.println();

	System.out.println(grades);
	System.out.println(grades2);
	System.out.println(grades3);
	System.out.println();

	//NOTE: Comparison not working correctly
	System.out.println(grades.equals(grades2));
	System.out.println(grades.equals(grades3));
    }
}
