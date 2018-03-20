package Ex1403;

public class RoomCarpet
{
    private RoomDimension roomDim;
    private double carpetCost;

    public RoomCarpet(RoomDimension roomDim, double carpetCost)
    {
	this.roomDim = roomDim;
	this.carpetCost = carpetCost;
    }

    public double getTotalCost()
    {
	return carpetCost * roomDim.getArea();
    }

    @Override
    public String toString()
    {
	return "Size: " + roomDim + ", Carpet cost: " + carpetCost;
    }
}
