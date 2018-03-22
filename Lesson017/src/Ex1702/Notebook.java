package Ex1702;

import java.util.ArrayList;

public class Notebook
{
    private ArrayList<Note> notes = new ArrayList<Note>();

    public Notebook()
    {
	notes = new ArrayList<Note>(5);
    }

    public int getNumberOfNotes()
    {
	int _currentLength = 0;
	for (int i = 0; i < notes.size(); i++)
	    if (notes.get(i) != null)
		_currentLength++;

	return _currentLength;
    }

    public Note getNote(int index)
    {
	return notes.get(index).copy();
    }

    public String getMessage(int index)
    {
	return notes.get(index).copy().getMessage();
    }

    public void addNote(Note note)
    {
	notes.add(note.copy());
    }

    public void addNote(String message)
    {
	notes.add(new Note(message));
    }

    public void addHighPriorityNote(String message)
    {
	Note _tempNote = new Note(message);
	_tempNote.setToHighPriority();

	notes.add(_tempNote);
    }

    public void removeNote(int index)
    {
	notes.remove(index);
    }

    public ArrayList<Note> getAllNotes()
    {
	return notes;
    }

    public int getNumberOfHighPriorityNotes()
    {
	int nrOfHighPrNotes = 0;
	for (int i = 0; i < notes.size(); i++)
	    if (notes.get(i).isHighPriority() == true)
		nrOfHighPrNotes++;

	return nrOfHighPrNotes;
    }

    public Note[] getAllHighPriorityNotes()
    {
	Note[] allHighPrNotes = new Note[getNumberOfHighPriorityNotes()];

	for (int i = 0; i < notes.size(); i++)
	    if (notes.get(i).isHighPriority() == true)
		allHighPrNotes[i] = notes.get(i).copy();

	return allHighPrNotes;
    }

    public String toString()
    {
	return notes.toString();
    }
}
