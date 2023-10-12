import java.util.Locale;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String playAgain = "";

        do
        {
            do
            {
                System.out.println("Player A please enter a move R,P,S: ");
                playerA = in.nextLine();
                playerA = playerA.toUpperCase();

                if (!playerA.equalsIgnoreCase("R") && !playerA.equalsIgnoreCase("P") && !playerA.equalsIgnoreCase("S"))
                {
                    System.out.println("Your move: " + playerA + " , is invalid. Please enter R, P, S");
                }
            }while (!playerA.equalsIgnoreCase("R") && !playerA.equalsIgnoreCase("P") && !playerA.equalsIgnoreCase("S"));

            do
            {
                System.out.println("Player B enter a move R,P,S: ");
                playerB = in.nextLine();
                playerB = playerB.toUpperCase();

                if (!playerB.equalsIgnoreCase("R") && !playerB.equalsIgnoreCase("P") && !playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Your move: " + playerB + " , is invalid. Please enter R, P, S");
                }

            }while (!playerB.equalsIgnoreCase("R") && !playerB.equalsIgnoreCase("P") && !playerB.equalsIgnoreCase("S"));

            System.out.println("Player A picked: " + playerA + " , Player B picked: " + playerB);

            if(playerA.equals("R"))
            {
                if (playerB.equals("R"))
                {
                    System.out.println("Rock vs Rock is a tie!");
                }
                else if (playerB.equals("P"))
                {
                    System.out.println("Paper covers Rock, Player B is the winner!! ");
                }
                else
                {
                    System.out.println("Rock smashes Scissors, Player A is the winner!!");
                }
            }
            else if (playerA.equals("P"))
            {
                if (playerB.equals("R"))
                {
                    System.out.println("Paper covers Rock, Player A is the winner!!");
                }
                else if (playerB.equals("P"))
                {
                    System.out.println("Paper vs Paper is a tie!! ");
                }
                else
                {
                    System.out.println("Scissors slices through Paper, Player B is the winner!!");
                }
            }
            else
            {
                if (playerB.equals("R"))
                {
                    System.out.println("Rock smashes Scissors, Player B is the winner!!");
                }
                else if (playerB.equals("P"))
                {
                    System.out.println("Scissors slices through Paper, Player A is the winner!! ");
                }
                else
                {
                    System.out.println("Scissors vs Scissors is a tie!!");
                }
            }
            System.out.println("Would you like to playAgain [Y/N]");
            playAgain = in.nextLine();
            playAgain = playAgain.toUpperCase();

        }while (playAgain.equals("Y"));

    }
}