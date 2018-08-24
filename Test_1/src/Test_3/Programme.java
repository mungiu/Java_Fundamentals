package Test_3;

public class Programme extends Education
{
	private String level;

	public Programme(String code, String title, String level)
	{
		super(code, title);
		this.level = level;
	}

	public String getLevel()
	{
		return level;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof Programme))
			return false;
		else
		{
			Programme temp = (Programme) obj;
			return temp.getLevel().equals(level);
		}
	}

	public String toString()
	{
		return "level: " + level;
	}
}
