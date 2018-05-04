package Ex2404;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MyFileIO
{
	// Writing binary files
	FileOutputStream fileOut = null;
	ObjectOutputStream write = null;
	// Reading binary files:
	FileInputStream fileIn = null;
	ObjectInputStream read = null;

	public void writeToFile(String fileName, Object obj) throws FileNotFoundException, IOException
	{
		fileOut = new FileOutputStream(fileName);
		write = new ObjectOutputStream(fileOut);

		write.writeObject(obj);
		write.close();
	}

	public void writeToFile(String fileName, Object[] objs) throws FileNotFoundException, IOException
	{
		fileOut = new FileOutputStream(fileName);
		write = new ObjectOutputStream(fileOut);

		for (int i = 0; i < objs.length; i++)
			write.writeObject(objs[i]);

		write.close();
	}

	public Object readObjectFromFile(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		fileIn = new FileInputStream(fileName);
		read = new ObjectInputStream(fileIn);
		read.close();

		return read.readObject();
	}

	// TODO: check if function finalized and working
	public Object[] readArrFromFile(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ArrayList<Object> tempArrList = new ArrayList<Object>();
		Object[] tempObjArr = null;

		fileIn = new FileInputStream(fileName);
		read = new ObjectInputStream(fileIn);

		while (true)
		{
			try
			{
				tempArrList.add(read.readObject());
			} catch (EOFException eof)
			{
				break;
			}
		}
		read.close();

		tempObjArr = new Object[tempArrList.size()];
		tempObjArr = tempArrList.toArray(tempObjArr);

		return tempObjArr;
	}
}
