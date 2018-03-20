package Ex1601;

public class Note
{
    private String message;
    private boolean highPriority;

    public Note(String message)
    {
	this.message = message;
	this.highPriority = false;
    }

    public String getMessage()
    {
	return this.message;
    }

    public void setMessage(String message)
    {
	this.message = message;
    }

    public boolean isHighPriority()
    {
	return this.highPriority;
    }

    public void setToHighPriority()
    {
	this.highPriority = true;
    }

    public void setToLowPriority()
    {
	this.highPriority = false;
    }

    public Note copy()
    {
	Note _copyNote = new Note(this.message);
	_copyNote.highPriority = this.highPriority;
	return _copyNote;
    }

    @Override
    public String toString()
    {
	return this.message;
    }
}
