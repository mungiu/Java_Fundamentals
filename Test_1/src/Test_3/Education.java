package Test_3;

public abstract class Education
{

	private String code;
	private String title;

	public Education(String code, String title)
	{
		this.code = code;
		this.title = title;
	}

	// getCode()
	// getTitle()

	public String getCode()
	{
		return code;
	}

	public String getTitle()
	{
		return title;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof Education))
			return false;
		else
		{
			Education temp = (Education) obj;
			return temp.getCode().equals(getCode()) && temp.getTitle().equals(getTitle());
		}
	}
}
