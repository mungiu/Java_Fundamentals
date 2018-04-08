package practice_MidtermExam_4;

public class JavaFile
{
	private boolean hasAMainMethod = false;

	private FileName fileName;

	public JavaFile(String fileName)
	{
		this.fileName = new FileName(fileName, "java");
	}

	public FileName getFileName()
	{
		return fileName.copy();
	}

	public boolean hasAMainMethod()
	{
		return hasAMainMethod;
	}

	public void addAMainMethod()
	{
		hasAMainMethod = true;
	}

	@Override
	public String toString()
	{
		return "filename " + fileName + ", has a main method " + hasAMainMethod;
	}
}
