public class RoomCarpet
{
    private RoomDimension size;
    private double carpetCost;

    public RoomCarpet(RoomDimension dim, double cost)
    {
        size = dim;
        carpetCost = cost;
    }

    public double getTotalCost()
    {
        return size.getArea() * carpetCost;
    }

    public String toString()
    {
        String str = String.format("The carpet cost will be $%.2f", getTotalCost());
        return str;
    }
}
