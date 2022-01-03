/*
  This program stimulates the game of Rock Paper Scissors Lizard Spock.
*/

import java.util.Random;
import java.util.Scanner;

public class RPSLSp
{
   public static void main(String[] args) 
   {
       Scanner sncr = new Scanner(System.in);
       Random randGen = new Random();
       
       String userChoice, computerChoice, yesNo = null;
       int computerInput, computerWinsCount = 0, playerWinsCount = 0, tieCount = 0, numGames=0;
               
       do {  
           System.out.println("\nLet's play Rock, Paper, Scissors, Lizard, Spock!");       
           System.out.print("Enter your choice: ");
           userChoice = sncr.next();
           computerInput = randGen.nextInt(5);
           while (!(userChoice.equalsIgnoreCase("Rock")) &&
                  !(userChoice.equalsIgnoreCase("Paper")) &&
                  !(userChoice.equalsIgnoreCase("Scissors")) &&
                  !(userChoice.equalsIgnoreCase("Spock")) &&
                  !(userChoice.equalsIgnoreCase("Lizard")))
           {
               System.out.println("Illegal choice: "+ userChoice);
               System.out.print("Re-enter your play: ");
               userChoice = sncr.next();              
           }
               
           computerInput = randGen.nextInt(5);
           switch (computerInput) {
               case 0:
                  computerChoice= "Rock";
                  break;
               case 1:
                  computerChoice = "Paper";
                  break;
               case 2:
                  computerChoice = "Scissors";
                  break;
               case 3:
                  computerChoice = "Lizard";
                  break;
               default:
                  computerChoice = "Spock";
                  break;
           }
           
           System.out.println("Computer chooses " + computerChoice);


           if (userChoice.equalsIgnoreCase("Rock")
                   && computerChoice.equalsIgnoreCase("Rock")) {
                              System.out.println("It’s a tie!");
               tieCount++;
               numGames++;
           }
           else if (userChoice.equalsIgnoreCase("Rock")
                   && computerChoice.equalsIgnoreCase("Paper")) {
               System.out.println("Paper covers Rock. Computer wins!!");
               computerWinsCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Rock")
                   && computerChoice.equalsIgnoreCase("Scissors")) {
               System.out.println("Rock crushes Scissors. You win!!");
               playerWinsCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Rock")
                   && computerChoice.equalsIgnoreCase("Lizard")) {
               System.out.println("Rock crushes Lizard. You win!!");
               playerWinsCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Rock")
                   && computerChoice.equalsIgnoreCase("Spock")) {
               System.out.println("Spock vaporizes Rock. Computer wins!!");
               computerWinsCount++;
               numGames++;
               break;
           } 
           else if (userChoice.equalsIgnoreCase("Paper")
                   && computerChoice.equalsIgnoreCase("Rock")) {
               System.out.println("Paper covers Rock. You win!!");
               playerWinsCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Paper")
                   && computerChoice.equalsIgnoreCase("Paper")) {
               System.out.println("It’s a tie!");
               tieCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Paper")
                   && computerChoice.equalsIgnoreCase("Scissors")) {
               System.out.println("Scissors cuts Paper. Computer wins!!");
               computerWinsCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Paper")
                   && computerChoice.equalsIgnoreCase("Lizard")) {
               System.out.println("Lizard eats Paper. Computer wins!!");
               computerWinsCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Paper")
                   && computerChoice.equalsIgnoreCase("Spock")) {
               System.out.println("Paper disproves Spock. You win!!");
               playerWinsCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Scissors")
                   && computerChoice.equalsIgnoreCase("Rock")) {
               System.out.println("Rock crushes Scissors. Computer wins!!");
               computerWinsCount++;
               numGames++;
               break;
           } 
           else if (userChoice.equalsIgnoreCase("Scissors")
                   && computerChoice.equalsIgnoreCase("Paper")) {
               System.out.println("Scissors cuts Paper. You win!!");
               playerWinsCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Scissors")
                   && computerChoice.equalsIgnoreCase("Scissors")) {
               System.out.println("It’s a tie!");
               tieCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Scissors")
                   && computerChoice.equalsIgnoreCase("Lizard")) {
               System.out.println("Scissors decapitates Lizard. You win!!");
               playerWinsCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Scissors")
                   && computerChoice.equalsIgnoreCase("Spock")) {
               System.out.println("Spock smashes Scissors. Computer wins!!");
               computerWinsCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Lizard")
                   && computerChoice.equalsIgnoreCase("Rock")) {
               System.out.println("Rock crushes Lizard. Computer wins!!");
               computerWinsCount++;
               numGames++;
               break;
           } 
           else if (userChoice.equalsIgnoreCase("Lizard")
                   && computerChoice.equalsIgnoreCase("Paper")) {
               System.out.println("Lizard eats Paper. You win!!");
               playerWinsCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Lizard")
                   && computerChoice.equalsIgnoreCase("Scissors")) {
               System.out.println("Scissors decapitates Lizard. Computer wins!!");
               computerWinsCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Lizard")
                   && computerChoice.equalsIgnoreCase("Lizard")) {
               System.out.println("It's a tie!");
               tieCount++;
               numGames++;
           }
           else if (userChoice.equalsIgnoreCase("Lizard")
                   && computerChoice.equalsIgnoreCase("Spock")) {
               System.out.println("Lizard poisons Spock. You win!!");
               playerWinsCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Spock")
                   && computerChoice.equalsIgnoreCase("Rock")) {
               System.out.println("Spock vaporizes Rock. You win!!");
               playerWinsCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Spock")
                   && computerChoice.equalsIgnoreCase("Paper")) {
               System.out.println("Paper disproves Spock. Computer wins!!");
               computerWinsCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Spock")
                   && computerChoice.equalsIgnoreCase("Scissors")) {
               System.out.println("Spock smashes Scissors. You win!!");
               playerWinsCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Spock")
                   && computerChoice.equalsIgnoreCase("Lizard")) {
               System.out.println("Lizard poisons Spock. Computer wins!!");
               computerWinsCount++;
               numGames++;
           } 
           else if (userChoice.equalsIgnoreCase("Spock")
                   && computerChoice.equalsIgnoreCase("Spock")) {
               System.out.println("It's a tie!");
               tieCount++;
               numGames++;
           }

           System.out.print("Play again? Enter yes or no: ");
           yesNo = sncr.next();
       } 
       
       while (yesNo.equalsIgnoreCase("Yes"));
           
       while (!(yesNo.equalsIgnoreCase("No"))) {
                 System.out.println("Sorry, that response is invalid");
                 System.out.print("Enter yes or no: ");
                 yesNo = sncr.next();
       }
       while (yesNo.equalsIgnoreCase("No")){
               System.out.println("\nNumber of games played: " + numGames);
               System.out.println("You won: " + playerWinsCount + " times!");
               System.out.println("Computer won: " + computerWinsCount + " times!");
               System.out.println("There were: " + tieCount + " tie games!");
               System.out.println("\nThanks for playing!");
               break;
       }
    }
}
