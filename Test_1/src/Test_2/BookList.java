package Test_2;

import java.util.ArrayList;

public class BookList
{
	private ArrayList<Book> bookList;

	public int getNumberOfBooks()
	{
		return bookList.size();
	}

	public void addBook(Book book)
	{
		bookList.add(book);
	}

	public Book getBook(int index)
	{
		return bookList.get(index);
	}

	public Book getBook(String isbn)
	{
		for (int i = 0; i < bookList.size(); i++)
			if (isbn == bookList.get(i).getIsbn())
				return bookList.get(i);

		return null;
	}

	public void removeBook(int index)
	{
		bookList.remove(index);
	}

	public int getIndexOfFirstPrintedBook()
	{
		for (int i = 0; i < bookList.size(); i++)
			if (bookList.get(i) instanceof PrintedBook)
				return i;

		return -1;
	}

	public int getNumbeOfBookByType(String bookType)
	{
		int numberOfBooks = 0;

		for (int i = 0; i < bookList.size(); i++)
			if (bookList.get(i).getBookType().equals(bookType))
				numberOfBooks++;

		return numberOfBooks;
	}

	public Book[] getBooksByType(String bookType)
	{
		Book[] booksArr;
		int size = 0;

		for (int i = 0; i < bookList.size(); i++)
			if (bookList.get(i).getBookType().equals(bookType))
				size++;

		booksArr = new Book[size];

		for (int i = 0; i < bookList.size(); i++)
			if (bookList.get(i).getBookType().equals(bookType))
				booksArr[i] = (Book) bookList.get(i);

		return booksArr;
	}

	public EBook[] getAllEBooks()
	{
		EBook[] booksArr;
		int size = 0;

		for (int i = 0; i < bookList.size(); i++)
			if (bookList.get(i).getBookType().equals("E-book"))
				size++;

		booksArr = new EBook[size];

		for (int i = 0; i < bookList.size(); i++)
			if (bookList.get(i).getBookType().equals("E-book"))
				booksArr[i] = (EBook) bookList.get(i);

		return booksArr;
	}

	@Override
	public String toString()
	{
		return "this is a BookList of size: " + bookList.size();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof BookList))
			return false;
		else
		{
			BookList temp = (BookList) obj;
			return temp.getNumberOfBooks() == getNumberOfBooks()
					&& temp.getIndexOfFirstPrintedBook() == getIndexOfFirstPrintedBook();

		}
	}
}
