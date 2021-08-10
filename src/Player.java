public class Player
{
    private String name;
    private int points;
    private int numOfTurn;

    public Player()
    {
        points = 50;
    }
    public Player(String name,int points, int numOfTurn)
    {
        this.name = name;
        this.points = points;
        this.numOfTurn = numOfTurn;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName()
    {
        this.name = name;
    }

    public int getPoints()
    {
        return this.points;
    }

    public int deductPoints(int p)
    {
        if((this.points - p) < 1)
        {
            this.points = this.points - p + p;
        }else {
            this.points = this.points - p;
        }
        return this.points;
    }

    /*
    public int deductPoints(int p)
    {
        this.points = this.points - p;
        return this.points;
    }

     */

    public int getNumOfTurn()
    {
        return this.numOfTurn;
    }

    public void deductNumOfTurn()
    {
        this.numOfTurn--;
    }

}
