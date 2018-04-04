package practice_MidtermExam_3;

import java.util.ArrayList;

public class SiteCollection
{
	private int size;
	private ArrayList<Website> websites;

	public SiteCollection(int maxSites)
	{
		size = maxSites;
		websites = new ArrayList<Website>(size);
	}

	public int getNumberOfSites()
	{
		return websites.size();
	}

	public int getNumberOfUpdatedSites()
	{
		int temp = 0;
		for (int i = 0; i < websites.size(); i++)
			if (websites.get(i).needsUpdate())
				temp++;

		return temp;
	}

	public void addSite(Website site)
	{
		websites.add(site);
	}

	public void removeSite(String url)
	{
		for (int i = 0; i < websites.size(); i++)
			if (websites.get(i).getUrl() == url)
				websites.remove(i);
	}

	public Website[] getAllSites()
	{
		return websites.toArray(new Website[websites.size()]);
	}

	public Website[] getAllNotUpdatedSites()
	{
		ArrayList<Website> temp = new ArrayList<Website>();
		for (int i = 0; i < websites.size(); i++)
			if (websites.get(i).needsUpdate())
				temp.add(websites.get(i));

		return temp.toArray(new Website[temp.size()]);
	}

	@Override
	public String toString()
	{
		return websites.toString();
	}
}
