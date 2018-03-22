package Ex1702;

public class GradeList
{
    private Grade[] grades;

    public GradeList(int numberOfGrades)
    {
	this.grades = new Grade[numberOfGrades];
    }

    public int getNumberOfGrades()
    {
	int currentNumberOfGrades = 0;
	for (Grade i : grades)
	    if (i != null && i.getGrade() != Integer.MAX_VALUE)
		currentNumberOfGrades++;
	return currentNumberOfGrades;
    }

    public int getGrade(int index)
    {
	return this.grades[index].getGrade();
    }

    public void setGrade(Grade grade, int index)
    {
	this.grades[index] = grade;
    }

    public double getAverage()
    {
	int arrSum = 0;
	for (int i = 0; i < grades.length; i++)
	    if (grades[i] != null && grades[i].getGrade() != Integer.MAX_VALUE)
		arrSum += grades[i].getGrade();

	return (double) arrSum / getNumberOfGrades();
    }

    @Override
    public String toString()
    {
	String toString = "";
	for (int i = 0; i < grades.length; i++)
	    if (grades[i] != null && grades[i].getGrade() != Integer.MAX_VALUE)
		toString += grades[i].getGrade() + " ";

	return toString;
    }

    // NOT WORKING CORRECTLY
    @Override
    public boolean equals(Object gradeList)
    {
	// checking is object types are same
	if (!(gradeList instanceof GradeList))
	    return false;
	else
	{
	    GradeList _gradeList = (GradeList) gradeList;

	    if (this.grades.length != _gradeList.grades.length)
		return false;
	    else
		for (int i = 0; i < _gradeList.grades.length; i++)
		    if (this.grades[i] != _gradeList.grades[i])
			return false;

	    return true;
	}
    }
}
