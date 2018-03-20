package Ex1401;

public class Brain
{
    private String[] memoryItems;

    public Brain(int arraySize)
    {
	memoryItems = new String[arraySize];
	for (int i = 0; i < memoryItems.length; i++)
	    memoryItems[i] = " ";
    }

    public int getIQ()
    {
	int tempIq = 0;

	// checking biggest > 20 and smallest > 10
	for (int i = 0; i < memoryItems.length; i++)
	{
	    if (i + 1 < memoryItems.length)
		if (Math.max(memoryItems[i].length(), memoryItems[i + 1].length()) > 20
			&& Math.min(memoryItems[i].length(), memoryItems[i + 1].length()) > 10)
		    tempIq = 130;
		else if (Math.min(memoryItems[i].length(), memoryItems[i + 1].length()) > 10)
		    tempIq = 100;
		else if (Math.min(memoryItems[i].length(), memoryItems[i + 1].length()) < 10 || memoryItems[i] == null)
		    tempIq = 70;
	}

	return tempIq;
    }

    public boolean isBrainDamaged()
    {
	for (int i = 0; i < memoryItems.length; i++)
	    if (memoryItems[i] == null)
		return true;

	return false;
    }

    /** Writes info to active memory */
    public void remember(String info)
    {
	// NOTE: Copying string values nor reference points
	for (int i = memoryItems.length; i > 0; i--)
	    if (i - 1 > 0)
		memoryItems[i - 1] = memoryItems[i - 2];

	memoryItems[0] = info;
    }

    public void refreshMemory(String info)
    {
	String _memorySwap = null;

	for (int i = 1; i < memoryItems.length; i++)
	    if (info.equals(memoryItems[i]))
	    {
		_memorySwap = memoryItems[i];
		memoryItems[i] = memoryItems[0];
		memoryItems[0] = _memorySwap;
	    }
    }

    /** Checks if info has been recorded in one of memory variables */
    public boolean recall(String info)
    {
	for (int i = 0; i < memoryItems.length; i++)
	    if (memoryItems[i] == info)
		return true;

	return false;
    }

    /** Retrieves active memory item */
    public String recall()
    {
	return memoryItems[0];
    }

    @Override
    public String toString()
    {
	return "I remember: " + memoryItems[0] + ". I remember a bit less about: " + memoryItems[1]
		+ ". I almost forgot about: " + memoryItems[2];
    }

    @Override
    public boolean equals(Object obj)
    {
	if (!(obj instanceof Brain))
	    return false;
	else
	{
	    Brain _brain = (Brain) obj;
	    return (this.memoryItems[0].equals(_brain.memoryItems[0])
		    && this.memoryItems[1].equals(_brain.memoryItems[1])
		    && this.memoryItems[2].equals(_brain.memoryItems[2]));
	}
    }
}
