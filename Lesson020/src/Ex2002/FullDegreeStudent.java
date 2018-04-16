package Ex2002;

public class FullDegreeStudent extends Student
{
	private String degree;

	public FullDegreeStudent(String name, int yearsOld, String university, String degree)
	{
		super(name, yearsOld, university);
		this.degree = degree;
	}

	public String getDegree()
	{
		return degree;
	}

	public void setDegree(String degree)
	{
		this.degree = degree;
	}

	public String toString()
	{
		return super.toString() + " " + degree;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof FullDegreeStudent))
			return false;
		else
		{
			FullDegreeStudent temp = (FullDegreeStudent) obj;
			return super.equals(temp) && degree.equals(temp.degree);
		}
	}
}
