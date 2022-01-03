/*
  This program lets the user create a class called DeckofCards 
that stores 52 objects of the Card class, create methods to shuffle 
the deck, deal a card, and determine if the deck has cards remaining.
*/

public class DeckOfCards
{
   private static Card[] cards;
   private static int numberofCards;
   private static final int NUMBER_OF_CARDS = 52;
 
   public DeckOfCards() 
   {
      numberofCards = NUMBER_OF_CARDS;
      cards = new Card[NUMBER_OF_CARDS];
      int a = 0;
      for (int faceVal = 1; faceVal <= 13; faceVal++)
         for (int suitVal = 1; suitVal <= 4; suitVal++)
         {
            cards[a++] = new Card(faceVal, suitVal);
         }
   }
    
   public static Card carDeal() 
   {
      if(numberofCards > 0) 
      {
         return cards[--numberofCards];
      }
      return null;
   }
    
   public static boolean cardsRemaining() 
   {
      if(numberofCards > 0) 
      {
         return true;
      }
      return false;
   }

   public void deckShuffle() 
   {
      Card temp;
      int a, b;
      for (int i = 0; i < 9999 ; i++)
      {
         a = (int)(NUMBER_OF_CARDS * Math.random());
         b = (int)(NUMBER_OF_CARDS * Math.random());
         
         temp = cards[a];
         cards[a] = cards[b];
         cards[b] = temp;
      }
   }
}

