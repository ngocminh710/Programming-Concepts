/*
  This program lets the user create a class called Card that 
contains instance data to represent a playing card with a face and a suit. 
*/

public class Card
{
   private static int faceVal;
   private static int suitVal;
   private String faceName;
   private String suitName;
   
   public Card (int faceVal, int suitVal) 
   {
        this.faceVal = faceVal;
        faceNumber();
        this.suitVal = suitVal;
        suitNumber();
    }
    
    private void faceNumber() 
    {
        switch(faceVal) 
        {
            case 1: 
                faceName = "Ace";
                break;
            case 2: 
                faceName = "Two";
                break;
            case 3: 
                faceName = "Three";
                break;
            case 4: 
                faceName = "Four";
                break;
            case 5: 
                faceName = "Five";
                break;
            case 6: 
                faceName = "Six";
                break;
            case 7: 
                faceName = "Seven";
                break;
            case 8: 
                faceName = "Eight";
                break;
            case 9: 
                faceName = "Nine";
                break;
            case 10: 
                faceName = "Ten";
                break;
            case 11: 
                faceName = "Jack";
                break;
            case 12: 
                faceName = "Queen";
                break;
            case 13: 
                faceName = "King";
                break;
        }
    }
    
    private void suitNumber() 
    {
        switch(suitVal) 
        {
            case 1: 
                suitName = "Spades";
                break;
            case 2: 
                suitName = "Clubs";
                break;
            case 3: 
                suitName = "Diamonds";
                break;
            case 4:  
                suitName = "Hearts";
                break;
        }
    }
    
    public String toString() 
    {
        return (faceName + " of " + suitName);
    }
}


