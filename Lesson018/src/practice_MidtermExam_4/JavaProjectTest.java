package practice_MidtermExam_4;

public class JavaProjectTest
{
	public static void main(String[] args)
	{
		JavaProject pr1 = new JavaProject("pr1");
		JavaProject pr2 = new JavaProject("pr2");

		JavaFile f1 = new JavaFile("f1");
		f1.addAMainMethod();
		JavaFile f2 = new JavaFile("f2");

		pr1.addJavaFile(f1);
		pr2.addJavaFile(f2);

		System.out.println(pr1.getFirstJavaFileWithAMainMethod().getFileName().getFullName());
		System.out.println(pr2.getFileName(0).getName());
	}
}
