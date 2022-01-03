/*
  This program uses the Babylonian method to compute the square root.  
*/

import java.util.Scanner;
public class BabaylonSquareRoot
{
   static double nextguess=1; 
   static double prevguess; 
   static double n; 
   public static void main(String [] args) 
   {
      Scanner sncr = new Scanner(System.in);
      System.out.println("This program will calculate the square root of a number\n" 
                         + "using the Babylonian method.\n");
      System.out.print("Enter a positive number: "); 
      n = sncr.nextDouble(); 
      
      while (n < 1)
      { 
           System.out.println("Number must be greater than 0.");
           System.out.print("Re-enter a number: ");
           n = sncr.nextDouble();
      }
      
      do
      {
           prevguess = nextguess; 
           nextguess = guess(prevguess); 

      }while(!(Math.abs(nextguess-prevguess) <= 0.00001)); 

      System.out.println("The square root of " + n + " is " + nextguess); 
   }

   
   private static double guess(double prevguess)
   {
      double nextguess;
      nextguess = (prevguess + (n / prevguess))/2; 
      return nextguess; 
   }
}


