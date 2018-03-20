package Ex1601;

public class NotebookTest
{
    public static void main(String[] args)
    {
	Notebook notebook = new Notebook(5);
	
	Note three = new Note("three");
	Note four = new Note ("four");
	Note five = new Note("five");
	
	four.setToHighPriority();
	four.setToLowPriority();
	
	five.setToHighPriority();
	
	
	notebook.addNote("one");
	notebook.getAllNotes()[0].setToHighPriority();
	notebook.addNote("two");
	notebook.addNote(three);
	notebook.addNote(four);
	notebook.addNote(five);
	
	notebook.removeNote(2);
	notebook.addNote("MIDDLE");
	
	System.out.println(notebook);
    }
}
