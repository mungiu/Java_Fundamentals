package Ex1701;

public class Grade
{
    private String courseName;
    private int grade;

    Grade(String courseName, int grade)
    {
	this.courseName = courseName;
	this.grade = grade;
    }

    public String getCourseName()
    {
	return courseName;
    }

    public int getGrade()
    {
	return grade;
    }

    public void setCourseName(String courseName)
    {
	this.courseName = courseName;
    }

    public void setGrade(int grade)
    {
	this.grade = grade;
    }

    @Override
    public String toString()
    {
	return courseName + " " + grade;
    }
}
