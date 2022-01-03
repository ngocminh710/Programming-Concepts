/*
  This program lets the user enter 10 floating point values and stores the ten values in an array,
then calculates the mean and standard deviation of the numbers. 
*/

import java.util.Scanner;

public class Markov 
{
   public static void main(String[] args) 
   {
      Scanner sncr = new Scanner(System.in);
      int r,c;
      final int ROW = 3;      
      final int COL = 3;
      double [][] matrix = new double [ROW][COL];
      System.out.println("Please enter the values for your 3 by 3 matrix: ");
        
      for (r = 0; r <ROW; r++) 
         for (c = 0; c <COL; c++) 
            matrix[r][c] = sncr.nextDouble();

      System.out.println("The matrix you entered is: ");
      for (r = 0; r < ROW; r++) 
      {
         for (c = 0; c < COL; c++) 
            System.out.print(matrix[r][c] + " ");
            System.out.println();
      }


      if (markovCheck(matrix)) 
      {
         System.out.println("It is a Markov matrix");
      } 
      else 
      {
         System.out.println("It is not a Markov matrix");
      }


   }

   private static boolean markovCheck (double[][] matrix) 
   {
      boolean status = true;
      double colSum = 0;
        
      for (int c = 0; c < matrix.length; c++) 
      { 
          colSum=0;
         for (int r = 0; r < matrix[c].length; r++) 
         {
             colSum+=matrix[r][c];
         }
         if(colSum!=1) return false;
      }
      return true;
   }
}
            
   
