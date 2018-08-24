package Test_2;

public class PrintedBook extends Book
{
	private boolean isPaperback;

	PrintedBook(String title, String isbn, boolean paperback)
	{
		super(title, isbn);
		this.isPaperback = paperback;
	}

	public boolean isPaperBack()
	{
		return isPaperback;
	}

	public String getBookType()
	{
		if (isPaperback)
			return "Peperback";
		else
			return "hard cover";
	}

	public String toString()
	{
		return "is paperback: " + isPaperback;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof PrintedBook))
			return false;
		else
		{
			PrintedBook temp = (PrintedBook) obj;
			return temp.isPaperBack() == isPaperback;
		}
	}
}
