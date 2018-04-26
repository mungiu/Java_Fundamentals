package Assignment1;

public class PriorityNote extends Note
{
	private int priority = 3;

	public PriorityNote(String message, int priority)
	{
		super(message);
		this.priority = priority;
	}

	public int getPriority()
	{
		return priority;
	}
	
	@Override
	public Note copy()
	{
		return new PriorityNote(super.getMessage(), priority);
	}

	@Override
	public String toString()
	{
		return super.toString() + " PriorityNote [priority=" + priority + "]";
	}
}
