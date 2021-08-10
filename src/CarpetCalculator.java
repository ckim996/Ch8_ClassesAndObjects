import java.util.Scanner;

public class CarpetCalculator
{
    public static void main(String[] args)
    {
        double length, width, price;
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to Carpet Calculator, \nPlease enter length of carpet: ");
        length = sc.nextDouble();
        System.out.print("\nPlease enter width of carpet: ");
        width = sc.nextDouble();
        System.out.print("\nWhat is the desired price you would like for your carpet per square foot: ");
        price = sc.nextDouble();

        RoomDimension dim = new RoomDimension(length,width);
        System.out.println(dim.toString());
        RoomCarpet carpet = new RoomCarpet(dim,price);
        System.out.println(carpet.toString());
    }
}
