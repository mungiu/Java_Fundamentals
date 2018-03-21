package Ex1605;

public class DriverExam
{
    int index = 0;
    private String[] correctAnsArr = new String[]
    { "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A" };
    private String[] studentAnsArr = new String[20];

    public void addAnswer(String ans)
    {
	if (ans.equals("A") || ans.equals("B") || ans.equals("C") || ans.equals("d") || ans.equals(" "))
	{
	    studentAnsArr[index] = ans;
	    System.out.println("check");
	    index++;
	} else
	{
	    System.out.println("Please input A, B, C, D or smpty space");
	}
    }

    public int questionsMissed()
    {
	int questionsMissed = 0;

	for (String strings : studentAnsArr)
	    if (strings.equals(" "))
		questionsMissed++;

	return questionsMissed;
    }

    public int totalCorrect()
    {
	int totalCorrect = 0;
	for (int i = 0; i < studentAnsArr.length; i++)
	    if (studentAnsArr[i].equals(correctAnsArr[i]))
		totalCorrect++;

	return totalCorrect;
    }

    public int totalIncorrect()
    {
	int totalInCorrect = 0;
	for (int i = 0; i < studentAnsArr.length; i++)
	    if (!(studentAnsArr[i].equals(correctAnsArr[i])))
		totalInCorrect++;

	return totalInCorrect;
    }

    public boolean passed()
    {
	if (totalCorrect() >= 15)
	    return true;
	else
	    return false;
    }
}
