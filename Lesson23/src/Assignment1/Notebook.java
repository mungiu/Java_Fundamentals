package Assignment1;

import java.util.ArrayList;
import java.util.Arrays;

public class Notebook
{
	private int numberOfNotes;

	private ArrayList<Note> notes;

	public Notebook(int maxNumberOfNotes)
	{
		notes = new ArrayList<Note>(maxNumberOfNotes);
		numberOfNotes = 0;
	}

	public void addNote(Note note)
	{
		if (note instanceof PriorityNote)
			notes.add((PriorityNote) note);
		else if (note instanceof DatedNote)
			notes.add((DatedNote) note);
	}

	public void setNote(Note note, int index)
	{
		if (note instanceof PriorityNote)
			notes.set(index, (PriorityNote) note);
		else if (note instanceof DatedNote)
			notes.set(index, (DatedNote) note);
	}

	public void removeNote(int index)
	{
		notes.remove(index);
	}

	public Note getNote(int index)
	{
		return notes.get(index).copy();
	}

	public int getNumberOfPriorityNotes()
	{
		int count = 0;
		for (int i = 0; i < notes.size(); i++)
			// checking if it is a priority note && then casting it to priority note
			if (notes.get(i) instanceof PriorityNote)
				count++;

		return count;
	}

	public PriorityNote[] getPriorityNotes()
	{
		PriorityNote[] priorityNotesArr = new PriorityNote[getNumberOfPriorityNotes()];

		for (int i = 0; i < notes.size(); i++)
			for (int prio = 1; prio <= 3; prio++)
				for (int j = 0; j < priorityNotesArr.length; j++)
					//casting the Note to PriorityNote to access it as such (since it has all info as a PriorityNote)
					if (notes.get(j) instanceof PriorityNote & ((PriorityNote) notes.get(j)).getPriority() == prio)
						priorityNotesArr[j] = (PriorityNote) notes.get(j).copy();

		return priorityNotesArr;
	}

	@Override
	public String toString()
	{
		return "Notebook [numberOfNotes=" + numberOfNotes + ", notes=" + notes + "]";
	}

}
