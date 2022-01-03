/*
  This program lets the user enter 10 floating point values and stores the ten values in an array,
then calculates the mean and standard deviation of the numbers. 
*/

import java.util.Scanner;
import java.text.DecimalFormat; 

public class MeanSD
{   
   public static void main (String [] args)   
   {
      Scanner sncr = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat ("0.0000");
      
      double [] arrayVals = new double [10]; 
      System.out.print("Enter ten numbers: ");
     
      for (int i = 0; i < arrayVals.length; i++)     
         arrayVals[i] = sncr.nextDouble();      
            
      System.out.println("The mean is " + df.format(arrayMean(arrayVals)));
      System.out.println("The standard deviation is " + df.format(arraySD(arrayVals, arrayMean(arrayVals))));
   }
   
   public static double arrayMean (double [] arrayVals)
   {
      double arraySum = 0, arrayMean;      
      for (int i = 0; i < arrayVals.length; i++)         
         arraySum += arrayVals[i];
         arrayMean = arraySum / arrayVals.length;      
      return arrayMean;   
   }
   
   public static double arraySD (double [] arrayVals, double arrayMean)
   { 
      double arraySD = 0, sqDiff = 0;
      for (int i = 0; i < arrayVals.length; i++)
         sqDiff += Math.pow((arrayVals[i] - arrayMean),2);      
         arraySD = Math.sqrt(sqDiff/(arrayVals.length - 1));
      return arraySD;
   }
}      
