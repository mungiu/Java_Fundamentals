package practice_MidtermExam_3;

public class SiteAdministrator
{
	private SiteCollection siteCollection = new SiteCollection(3);
	private String name;
	
	public SiteAdministrator(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public SiteCollection getSiteCollection()
	{
		return siteCollection;
	}
	
	public Website getNextSiteToUpdate()
	{
		return siteCollection.getAllNotUpdatedSites()[0];
	}
	
	public Website[] getAllSitesToUpdate()
	{
		return siteCollection.getAllNotUpdatedSites();
	}
}
