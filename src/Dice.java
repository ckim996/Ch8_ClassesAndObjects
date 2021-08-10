import java.util.Random;

public class Dice
{
    private int sides;
    private int value;

    public Dice(int numSides)
    {
        sides = numSides;
        roll();
    }

    public void roll()
    {
        Random r = new Random();
        value = r.nextInt(sides) + 1;
    }

    public int getSides()
    {
        return sides;
    }

    public int getValue()
    {
        return value;
    }
}
