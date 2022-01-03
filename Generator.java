/*
  This program lets a user enter their first and last name (separately), then
generates a username using the first letter of their first name, the first three 
letters of their last name and a random number between 100 and 999.
*/

import java.util.Random;
import java.util.Scanner;

public class Generator
{
      public static void main(String [] args) 
      {
         Scanner scnr = new Scanner (System.in);
         Random random = new Random ();
         String firstName, lastName, userName;
         
         System.out.print("Enter your first name: ");
         firstName = scnr.nextLine();
         
         System.out.print("Enter your last name: ");
         lastName = scnr.nextLine();
         
         int number = random.nextInt(899) +100;
         userName = firstName.charAt(0) + lastName.substring(0,3) + number;

         System.out.println("Username: " + userName);

            
      }
}