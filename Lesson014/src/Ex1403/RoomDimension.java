package Ex1403;

public class RoomDimension
{
    private double length;
    private double width;

    public RoomDimension(double len, double w)
    {
	this.length = len;
	this.width = w;
    }

    public double getArea()
    {
	return length * width;
    }

    @Override
    public String toString()
    {
	return "Length: " + length + ", Width: " + width;
    }
}
