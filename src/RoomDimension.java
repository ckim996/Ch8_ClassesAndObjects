public class RoomDimension
{
    private double length;
    private double width;

    public RoomDimension(double len, double w)
    {
        length = len;
        width = w;
    }

    public double getArea()
    {
        return length * width;
    }

    public String toString()
    {
        String str = String.format("\nRoom dimension you desire is %.2f by %.2f and the area is %.2f m^2",length,width,getArea());
        return str;
    }
}
