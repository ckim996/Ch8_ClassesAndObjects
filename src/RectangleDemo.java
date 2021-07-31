import java.util.Scanner;

public class RectangleDemo
{
    public static void main(String[] args)
    {
        double l,w;
        Scanner sc = new Scanner(System.in);
        System.out.print("Length for rectangle: ");
        l = sc.nextDouble();
        System.out.print("Width for rectangle: ");
        w = sc.nextDouble();
        Rectangle r = new Rectangle(l,w);

        System.out.println("Your Rectangle length "+ r.getLength() +
                "\nYour Rectangle width " + r.getWidth());
        sc.nextLine();
        System.out.println("Would you like to change the current length and width of your Rectangle: (y/n)");
        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("y"))
        {
            changeRectangleLW(r);
            System.out.println("Your NEW Rectangle length "+ r.getLength() +
                    "\nYour NEW Rectangle width " + r.getWidth());
        }else{
            System.out.println("Exiting program");
        }

    }

    public static void changeRectangleLW(Rectangle r)
    {
        double l,w;
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide new Length for rectangle: ");
        l = sc.nextDouble();
        System.out.print("Provide new Width for rectangle: ");
        w = sc.nextDouble();

        r.setLength(l);
        r.setWidth(w);
    }
}
