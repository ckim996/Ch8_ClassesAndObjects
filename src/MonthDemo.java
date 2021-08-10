import java.util.Scanner;

public class MonthDemo
{
    public static void main(String[] args)
    {
        int favMonth;
        String leastFMonth;
        Scanner sc = new Scanner(System.in);

        // Using the no-arg constructor
        Month m1 = new Month();
        System.out.println("Every year, the month starts with " + m1);

        System.out.println("What is your favorite month: ");
        favMonth = sc.nextInt();

        // Using the int constructor
        Month m2 = new Month(favMonth);
        System.out.println(m2 + " is your favorite month");

        sc.nextLine();

        // Using the String constructor
        System.out.println("\nWrite your least favorite month in String: ");
        leastFMonth = sc.nextLine();
        Month m3 = new Month(leastFMonth);
        System.out.println(m3);

        System.out.println("\nIs your Favorite month greater than your Least favorite month?");
        System.out.println(m2.greaterThan(m3));

        System.out.println("\nIs your Favorite month less than your Least favorite month?");
        System.out.println(m2.lessThan(m3));
    }
}
