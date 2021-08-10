public class Area
{

    // Circle
    public static double getArea(double r)
    {
        return Math.PI * (r*r);
    }

    // Rectangle
    public static double getArea(int l, int w)
    {
        return l*w;
    }

    // Cylinder
    public static double getArea(double r, double h)
    {
        return Math.PI * (r*r) * h;
    }
}
