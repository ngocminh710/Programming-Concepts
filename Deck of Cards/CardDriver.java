/*
  This program lets the user create a driver class called CardDriver, 
whose main method shuffles the deck, asks the user for the number of 
cards they want, and deals that number of cards, printing each card as it is dealt. 
*/

import java.util.Scanner;
public class CardDriver 
{
   public static void main(String[] args) 
   {
      DeckOfCards deck = new DeckOfCards();
      deck.deckShuffle();
      
      Scanner sncr = new Scanner(System.in);
      int numCards = 0;
      System.out.print("How many cards? ");
      numCards = sncr.nextInt();
      
      int cardNum = 1;
      while(cardNum <= numCards && deck.cardsRemaining()) 
      {
         System.out.println(cardNum + ": " + deck.carDeal());
         cardNum++;
      }
    }
}

