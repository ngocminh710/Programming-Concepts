/*
  This program indicates invalid ticket number entries.
*/

import java.util.Scanner;

public class TicketVal
{
      public static void main(String [] args) 
      {
         Scanner scnr = new Scanner (System.in);
         int ticketNumber, fiveDigits, remainder, lastDigit;         
         
         System.out.print("Enter 6-digit ticket number: ");
         ticketNumber = scnr.nextInt();
         
         fiveDigits = ticketNumber/10;
         remainder = fiveDigits % 7;
         lastDigit = ticketNumber % 10;
         
         if (remainder == lastDigit) {
           System.out.println("The ticket number " + ticketNumber + " is valid.");
           System.out.println("");
           System.out.println("lastDigit = " + lastDigit);
           System.out.println("remainder = " + remainder);
         }
         else {
           System.out.println("The ticket number " + ticketNumber + " is invalid.");
           System.out.println("");
           System.out.println("lastDigit = " + lastDigit);
           System.out.println("remainder = " + remainder);
         }
      }            
}
