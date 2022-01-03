/*
  This program accepts a number of minutes and converts it to
both hours and days.
*/

import java.util.Scanner;

public class MinutesConversion
{
      public static void main(String [] args) 
      {
      Scanner sncr = new Scanner (System.in);
      final double MINUTES_PER_HOUR = 60;
      final double HOURS_PER_DAY = 24;
      int numMinutes;
      int numHours;
      int numDays;
      int remainingMinutes;
      int remainingHours;


      System.out.print("Enter number of minutes: ");
      numMinutes = sncr.nextInt();
      
      numHours = numMinutes / 60;
      remainingMinutes = numMinutes % 60;
      numDays = numHours / 24;
      remainingHours = numHours % 24;


      System.out.println(numMinutes + " minutes is " + numHours + " hours and " + remainingMinutes + " minutes or " +
                         numDays + " days and " + remainingHours + " hours.");
      }
}