package practice_MidtermExam_3;

public class SiteAdministratorTest
{
	public static void main(String[] args)
	{
		SiteAdministrator admin1 = new SiteAdministrator("Andrei");

		Website web1 = new Website("web1");
		Website web2 = new Website("web2");
		Website web3 = new Website("web3");

		admin1.getSiteCollection().addSite(web1);
		admin1.getSiteCollection().addSite(web2);
		admin1.getSiteCollection().addSite(web3);
		
		System.out.println(admin1.getSiteCollection().toString());
	}
}
