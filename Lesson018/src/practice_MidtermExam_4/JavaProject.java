package practice_MidtermExam_4;

import java.util.ArrayList;

public class JavaProject
{
	private String name;
	private ArrayList<JavaFile> files;

	public JavaProject(String name)
	{
		this.name = name;
		files = new ArrayList<JavaFile>();
	}

	public void addJavaFile(JavaFile file)
	{
		files.add(file);
	}

	public FileName getFileName(int index)
	{
		return files.get(index).getFileName();
	}

	public JavaFile getFirstJavaFileWithAMainMethod()
	{
		for (int i = 0; i < files.size(); i++)
			if (files.get(i).hasAMainMethod())
				return files.get(i);

		return null;
	}

	public String getProjectName()
	{
		return this.name;
	}
}
