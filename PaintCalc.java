/*
  This program asks the user to enter the length, width and height of a rectangular room,
  then calculate the amount of gallons needed, and calculate the cost of the paint needed.  
*/

import java.util.Scanner;
import java.text.DecimalFormat;
public class PaintCalc
{
   public static void main(String[] args) 
   {
      Scanner scnr = new Scanner(System.in);
      double wallLength, wallWidth, wallHeight;
        
      System.out.print("Enter the room's length (in feet): ");
      wallLength = scnr.nextDouble();
      while (wallLength <= 0)
      {
         System.out.println("The value you entered for the length is invalid.");
         System.out.print("Re-enter the room's length (in feet): ");
         wallLength = scnr.nextDouble();
      }

      System.out.print("Enter the room's width (in feet): ");
      wallWidth = scnr.nextDouble();
      while (wallWidth <= 0)
      {
         System.out.println("The value you entered for the width is invalid.");
         System.out.print("Re-enter the room's width (in feet): ");
         wallWidth = scnr.nextDouble();
      }

      System.out.print("Enter the room's height (in feet): ");
      wallHeight = scnr.nextDouble();
      while (wallHeight <= 0)
      {
         System.out.println("The value you entered for the height is invalid.");
         System.out.print("Re-enter the room's height (in feet): ");
         wallHeight = scnr.nextDouble();
      }
      
      areaMethod (wallLength, wallWidth, wallHeight);
   }
  
   public static void areaMethod ( double wallLength, double wallWidth, double wallHeight) 
   {
      DecimalFormat df = new DecimalFormat ("0.00");
      double paintCost;
      final double ONE_GALLON_PAINT_COST = 32.00;
      double area = 2 * (wallLength + wallWidth) * wallHeight;
      
      double gallonsPaintNeeded = gallonsMethod (area);
      paintCost = gallonsPaintNeeded * ONE_GALLON_PAINT_COST;
      
      System.out.println("You will need " + gallonsPaintNeeded + " gallons");
      System.out.println("The price to paint the room is " + "$" + df.format(paintCost));
   }

   private static double gallonsMethod(double area) 
   {
      final int SQFEET_PER_GALLON = 350;
      double gallonsPaintNeeded = area / SQFEET_PER_GALLON;
      return gallonsPaintNeeded;
   }
}

      
      
        





