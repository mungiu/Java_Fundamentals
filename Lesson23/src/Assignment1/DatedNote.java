package Assignment1;

public class DatedNote extends Note
{
	private MyDate date;

	public DatedNote(String message, MyDate date)
	{
		super(message);
		this.date = new MyDate(date.getDay(), date.getMonth(), date.getYear());
	}

	@Override
	public Note copy()
	{
		return new DatedNote(super.getMessage(), date);
	}

	@Override
	public String toString()
	{
		return super.toString() + " date: " + date;
	}
}
