package Ex1601;

import java.util.Arrays;

public class Notebook
{
    private Note[] notes;

    public Notebook(int maxNumberOfNotes)
    {
	notes = new Note[maxNumberOfNotes];
    }

    public int getNumberOfNotes()
    {
	int currentLength = 0;
	for (int i = 0; i < notes.length; i++)
	    if (notes[i] != null)
		currentLength++;

	return currentLength;
    }

    public Note getNote(int index)
    {
	return this.notes[index].copy();
    }

    public String getMessage(int index)
    {
	return this.notes[index].copy().getMessage();
    }

    public void addNote(Note note)
    {
	int currentLength = 0;
	for (int i = 0; i < notes.length; i++)
	    if (this.notes[i] != null)
		currentLength++;

	notes[currentLength] = note.copy();
    }

    public void addNote(String message)
    {
	int currentLength = 0;
	for (int i = 0; i < notes.length - 1; i++)
	    if (this.notes[i] != null)
		currentLength++;

	notes[currentLength] = new Note(message);
    }

    public void addHighPriorityNote(String message)
    {
	int currentLength = 0;
	for (int i = 0; i < notes.length; i++)
	    if (this.notes[i] != null)
		currentLength++;

	notes[currentLength + 1].copy().setMessage(message);
	notes[currentLength + 1].copy().setToHighPriority();
    }

    public void removeNote(int index)
    {
	notes[index] = null;
	// move all items one index back
	for (int i = index; i < notes.length - 1; i++)
	    if (i < notes.length)
		notes[i] = notes[i + 1].copy();
    }

    public Note[] getAllNotes()
    {
	Note[] _tempNotes = new Note[this.getNumberOfNotes()];
	for (int i = 0; i < notes.length; i++)
	    if (notes[i] != null)
	    {
		_tempNotes[i] = notes[i].copy();
	    }

	return _tempNotes;
    }

    public int getNumberOfHighPriorityNotes()
    {
	int nrOfHighPrNotes = 0;
	for (int i = 0; i < notes.length; i++)
	    while (this.notes[i].isHighPriority() == true)
		nrOfHighPrNotes++;

	return nrOfHighPrNotes;
    }

    public Note[] getAllHighPriorityNotes()
    {
	Note[] allHighPrNotes = new Note[getNumberOfHighPriorityNotes()];

	for (int i = 0; i < notes.length; i++)
	    if (this.notes[i].isHighPriority() == true)
		allHighPrNotes[i] = notes[i].copy();

	return allHighPrNotes;
    }

    public String toString()
    {
	return Arrays.deepToString(notes);
    }
}
