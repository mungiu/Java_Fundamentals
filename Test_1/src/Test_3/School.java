package Test_3;

public class School extends Education
{
	private String type;
	private static final String INFANT_SCHOOL = "InfantSchool";
	private static final String JUNIOR_HIGHSCHOOL = "Junior school";
	private static final String SECONDARY_SCHOOL = "Secondary school";
	private static final String HIGH_SCHOOL = "HighSchool";

	public School(String code, String title, String type)
	{
		super(code, title);
		this.type = type;
	}

	public String getSchoolType()
	{
		return type;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof School))
			return false;
		else
		{
			School temp = (School) obj;
			return temp.getSchoolType().equals(type);
		}
	}

	@Override
	public String toString()
	{
		return "school type: " + type;
	}
}
