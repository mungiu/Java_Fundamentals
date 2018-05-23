package Exam1;

import java.util.ArrayList;

public class ApartmentComplex
{
	private String address;
	private ArrayList<Residence> residences;

	public ApartmentComplex(String address)
	{
		residences = new ArrayList<Residence>();
		this.address = address;
	}

	public int getNumberOfResidences()
	{
		int count = 0;
		for (int i = 0; i < residences.size(); i++)
			if (residences.get(i) != null)
				count++;

		return count;
	}

	public void add(Residence residence)
	{
		residences.add(residence);
	}

	public Residence getResidence(int index)
	{
		return residences.get(index);
	}

	public Residence getResidenceByNumber(int number)
	{
		for (int i = 0; i < residences.size(); i++)
			if (residences.get(i).getNumber() == number)
				return residences.get(i);

		return null;
	}

	public Room getFirstAvailableRoom()
	{
		for (int i = 0; i < residences.size(); i++)
			if (((Room) residences.get(i)).isAvailable())
				return (Room) residences.get(i);

		return null;
	}

	public Apartment getFirstAvailableApartment()
	{
		for (int i = 0; i < residences.size(); i++)
			if (((Apartment) residences.get(i)).isAvailable())
				return (Apartment) residences.get(i);

		return null;
	}
}
