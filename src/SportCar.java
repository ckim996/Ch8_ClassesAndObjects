public class SportCar
{
    private CarType cT;
    private CarColor cC;
    private double price;

    public SportCar(CarType make, CarColor color, double cPrice)
    {
        cT = make;
        cC = color;
        price = cPrice;
    }

    public CarType getMake()
    {
        return cT;
    }

    public CarColor getColor()
    {
        return cC;
    }

    public double getPrice()
    {
        return price;
    }

    public String toString()
    {
        String str = String.format("Make: %s\nColor: %s\nPrice: $%,.2f",cT,cC,price);
        return str;
    }
}
