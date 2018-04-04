package practice_MidtermExam_3;

public class Website
{
	private String url;
	private boolean needsUpdate;

	public Website(String url)
	{
		this.url = url;
	}

	public String getUrl()
	{
		return url;
	}

	public boolean needsUpdate()
	{
		return needsUpdate;
	}

	public void markAsNotUpdate()
	{
		needsUpdate = true;
	}

	public void markAskUpdated()
	{
		needsUpdate = false;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Website))
			return false;
		else
		{
			Website temp = (Website) obj;

			return (url == temp.url && needsUpdate == temp.needsUpdate);
		}
	}

	@Override
	public String toString()
	{
		return "url " + url + " needsUpdate " + needsUpdate;
	}
}
