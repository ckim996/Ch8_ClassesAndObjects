import java.util.Scanner;

public class FirstToOne
{
    public static void main(String[] args)
    {
        final int START_POINT = 10;
        final int NUM_OF_SIDES = 6;
        int NUM_OF_TURNS = 5;
        int round = 0;
        System.out.println("\nWelcome to 'First To One Game'!" +
                "\nEach players will start with 30 points and the first player with exactly one point remaining wins." +
                "\nEvery time each players roll the dice total of 5 times, the value shown in the dice will be the amount deducted from your points." +
                "\nIf you get a number less than 1, you will be getting the dice value added to your points");

        String name, rollS;
        int numOfPlayers;
        Dice dice = new Dice(NUM_OF_SIDES);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nHow many players?: ");
        numOfPlayers = sc.nextInt();

        Player[] players = new Player[numOfPlayers];
        for(int i = 0; i < numOfPlayers; i++)
        {
            players[i] = new Player();
        }

        sc.nextLine();

        for(int j = 0 ; j < numOfPlayers; j++)
        {
            System.out.print("Input Player " + (j+1) + " first name: ");
            name = sc.nextLine();
            players[j] = new Player(name,START_POINT,NUM_OF_TURNS);
        }

        System.out.println();

        for(int z = 0; z < numOfPlayers; z++)
        {
            System.out.println("Player " + (z+1) + " (" + players[z].getName() + " / Points:" +players[z].getPoints() + " / Turn#:" +players[z].getNumOfTurn() + ")");
        }

        System.out.println();

        for(int l = 0; l < numOfPlayers; l++)
        {
            while(players[l].getNumOfTurn() > 0)
            {
                System.out.println("Round " + (round+1));
                round++;
                for(int k = 0; k < numOfPlayers; k++)
                {
                    System.out.print(players[k].getName() + "'s turn to roll. Type 'y' to roll: ");
                    rollS = sc.nextLine();
                    if(rollS.equalsIgnoreCase("y"))
                    {
                        // Should return 30 at first
                        int currentPoint = players[k].getPoints();
                        dice.roll();
                        System.out.println("Player " + (k+1) + " (" + players[k].getName() + ") rolled: " + dice.getValue());
                        currentPoint = players[k].deductPoints(dice.getValue());
                        NUM_OF_TURNS--;
                        players[k].deductNumOfTurn();
                        System.out.println("Player " + (k+1) + " (" + players[k].getName() + " / Points:" + currentPoint + " / Number of Turns Left:" +players[k].getNumOfTurn() + ")");
                        System.out.println();
                        if(players[k].getPoints() == 1)
                        {
                            getWinner(players);
                            System.exit(0);
                        }
                    }
                }
                System.out.println("-----------------------------------------");
            }
        }
        getWinner(players);

    }

    public static void getWinner(Player[] p)
    {
        int lowest = p[0].getPoints();
        String winner = p[0].getName();
        for(int a = 1; a <p.length; a++)
        {

            if (lowest > p[a].getPoints())
            {
                lowest = p[a].getPoints();
                winner = p[a].getName();
            }

        }
        System.out.println("Winner is " + winner + " with " + lowest + " points");
    }
}
