package Ex1702;

public class Grade
{
    private String courseName;
    private int grade = Integer.MAX_VALUE;

    public Grade(String courseName, int grade)
    {
	// check if grade is not equal to Danish Grade
	if (grade == -3 || grade == 0 || grade == 2 || grade == 4 || grade == 7 || grade == 10 || grade == 12)
	    this.grade = grade;
	else
	{
	    System.out.println("Invalid grade, please set Danish Grade");
	}

	this.courseName = courseName;
    }

    public int getGrade()
    {
	return this.grade;
    }

    public String getCourseName()
    {
	return this.courseName;
    }

    public void setGrade(int grade)
    {
	this.grade = grade;
    }

    public void setCourseName(String courseName)
    {
	this.courseName = courseName;
    }

    @Override
    public String toString()
    {
	return this.courseName + " " + this.grade;
    }

    @Override
    public boolean equals(Object grade)
    {
	if (!(grade instanceof Grade))
	    return false;
	else
	{
	    Grade _grade = (Grade) grade;
	    return this.grade == _grade.getGrade();
	}
    }
}
