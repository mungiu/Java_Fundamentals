package Test_2;

public class EBook extends Book
{
	private String url;

	public EBook(String url, String title, String isbn)
	{
		super(title, isbn);
		this.url = url;
	}

	public String getUrl()
	{
		return url;
	}

	public String getBookType()
	{
		return "E-book";
	}

	@Override
	public String toString()
	{
		return "EBook [url=" + url + "]";
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof EBook))
			return false;
		else
		{
			EBook temp = (EBook) obj;
			return temp.getUrl().equals(url);
		}
	}

}
