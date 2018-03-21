package Ex1701;

import java.util.ArrayList;

public class GradeList
{
    ArrayList<Grade> gradeList = new ArrayList<>();

    public GradeList(Grade... grade)
    {
	for (int i = 0; i < grade.length; i++)
	    addGrade(grade[i]);
    }

    public int getNumberOfGrades()
    {
	return gradeList.size();
    }

    public Grade[] getAllGrades()
    {
	return (Grade[]) gradeList.toArray();
    }

    public void addGrade(Grade grade)
    {
	gradeList.add(grade);
    }

    public double getAverage()
    {
	int sum = 0;
	for (int i = 0; i < gradeList.size(); i++)
	    sum += gradeList.get(i).getGrade();

	return sum / gradeList.size();
    }

    @Override
    public String toString()
    {
	String result = " ";
	for (int i = 0; i < gradeList.size(); i++)
	    result += (gradeList.get(i) + " ");

	return result;
    }
}
