package practice_MidtermExam_1;

import java.util.ArrayList;

public class ServiceBook
{
	private ArrayList<Service> services;

	public ServiceBook()
	{
		services = new ArrayList<Service>();
	}

	public void addService(Service service)
	{
		services.add(service);
	}

	public int getNumberOfServices()
	{
		return services.size();
	}

	public Service getService(int index)
	{
		return services.get(index);
	}

	public Service[] getAllServices()
	{

		return services.toArray(new Service[services.size()]);
		// return (Service[]) services.toArray();
	}

	public int[] getAllServiceMilages()
	{
		int[] _temp = new int[services.size()];
		for (int i = 0; i < _temp.length; i++)
			_temp[i] = services.get(i).getMileage();

		return _temp;
	}

	public boolean hasServiceOnDate(Date date)
	{
		Service[] _services = getAllServices();

		for (int i = 0; i < services.size(); i++)
			if (_services[i].getDate().equals(date))
				return true;

		return false;
	}

	public Date getDateOfLastService()
	{
		return getAllServices()[services.size() - 1].getDate();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof ServiceBook))
			return false;
		else
		{
			ServiceBook _temp = (ServiceBook) obj;

			return _temp.getAllServiceMilages() == getAllServiceMilages();
		}
	}

	@Override
	public String toString()
	{
		return services.toString();
	}
}
