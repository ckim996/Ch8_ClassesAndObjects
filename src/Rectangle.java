public class Rectangle
{
    private double length;
    private double width;

    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }

    public Rectangle(Rectangle r)
    {
        length = r.length;
        width = r.width;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setLength(double l)
    {
        length = l;
    }

    public void setWidth(double w)
    {
        width = w;
    }

    public Rectangle copy()
    {
        Rectangle obj = new Rectangle(length, width);
        return obj;
    }
}
