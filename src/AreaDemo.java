public class AreaDemo
{
    public static void main(String[] args)
    {
        System.out.printf("Area of a circle with a radius of 5 meter is: %.2f m^2", Area.getArea(5));
        System.out.printf("\nArea of a rectangle with a width of 3 meter and length of 5 meter is: %.2f m^2", Area.getArea(3,5));
        System.out.printf("\nArea of a cylinder with a radius 7.54 meter and height of 3.12 meter is: %.2f m^2", Area.getArea(7.54,3.12));
    }
}
