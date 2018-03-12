package Ex1401;

public class Brain
{
	private String activeMemoryItem;
	private String passiveMemoryItemOne;
	private String passiveMemoryItemTwo;

	public Brain()
	{
		this.activeMemoryItem = " ";
		this.passiveMemoryItemOne = " ";
		this.passiveMemoryItemTwo = " ";
	}

	public int getIQ()
	{
		if ((activeMemoryItem.length() > 20 || passiveMemoryItemOne.length() > 20 || passiveMemoryItemTwo.length() > 20)
				&& (activeMemoryItem.length() > 10 && passiveMemoryItemOne.length() > 10
						&& passiveMemoryItemTwo.length() > 10))
			return 130;
		else if (activeMemoryItem.length() > 10 && passiveMemoryItemOne.length() > 10
				&& passiveMemoryItemTwo.length() > 10)
			return 100;
		else if ((activeMemoryItem.length() < 10 || passiveMemoryItemOne.length() < 10
				|| passiveMemoryItemTwo.length() < 10)
				|| (activeMemoryItem == null || passiveMemoryItemOne == null || passiveMemoryItemTwo == null))
			return 70;
		else
			return 0;
	}

	public boolean isBrainDamaged()
	{
		if ((activeMemoryItem == null || passiveMemoryItemOne == null || passiveMemoryItemTwo == null))
			return true;
		else
			return false;
	}

	/** Writes info to active memory */
	public void remember(String info)
	{
		// NOTE: Copying string values nor reference points
		passiveMemoryItemTwo = new String(passiveMemoryItemOne);
		passiveMemoryItemOne = new String(activeMemoryItem);
		activeMemoryItem = new String(info);
	}

	public void refreshMemory(String info)
	{
		if (info.equals(passiveMemoryItemOne))
		{
			passiveMemoryItemTwo = new String(activeMemoryItem);
			activeMemoryItem = new String(passiveMemoryItemOne);
		} else if (info.equals(passiveMemoryItemTwo))
		{
			passiveMemoryItemOne = new String(activeMemoryItem);
			activeMemoryItem = new String(passiveMemoryItemTwo);
		}
	}

	/** Checks if info has been recorded in one of memory variables */
	public boolean recall(String info)
	{
		if (activeMemoryItem != null || activeMemoryItem.equals(info))
			return true;
		else if (passiveMemoryItemOne != null || passiveMemoryItemOne.equals(info))
			return true;
		else if (passiveMemoryItemTwo != null || passiveMemoryItemTwo.equals(info))
			return true;
		else
			return false;
	}

	/** Retrieves active memory item */
	public String recall()
	{
		return activeMemoryItem;
	}

	@Override
	public String toString()
	{
		return "I remember: " + activeMemoryItem + ". I remember a bit less about: " + passiveMemoryItemOne
				+ ". I almost forgot about: " + passiveMemoryItemTwo;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Brain))
			return false;
		else
		{
			Brain _brain = (Brain) obj;
			return (this.activeMemoryItem == _brain.activeMemoryItem
					&& this.passiveMemoryItemOne == _brain.passiveMemoryItemOne
					&& this.passiveMemoryItemTwo == _brain.passiveMemoryItemTwo);
		}
	}
}
