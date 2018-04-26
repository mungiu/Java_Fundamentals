package Assignment1;

import java.util.Arrays;

public class TestClass
{
	public static void main(String[] args)
	{
		Notebook notebook = new Notebook(4);

		PriorityNote note1 = new PriorityNote("CCCC", 3);
		PriorityNote note2 = new PriorityNote("BBBB", 2);
		PriorityNote note3 = new PriorityNote("AAAA", 1);

		MyDate date = new MyDate();
		DatedNote datedNote1 = new DatedNote("DATED", date);

		notebook.addNote(note1);
		notebook.addNote(note2);
		notebook.addNote(note3);
		notebook.addNote(datedNote1);

		System.out.println(notebook.getNumberOfPriorityNotes());
		System.out.println(notebook.getNote(2));
		System.out.println(Arrays.toString(notebook.getPriorityNotes()));
	}
}
