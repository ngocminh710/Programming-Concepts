/*
  This program lets the user enter the number of cookies eaten 
and displays the number of calories consumed.
*/

import java.util.Scanner;

public class CookiesCal
{
    public static void main(String [] args)
    {
       int numberOfCookiesPerBag = 40;
       int numberOfServingsPerBag = 10;
       int caloriesPerServing = 300;
       int caloriesPerCookie = caloriesPerServing/(numberOfCookiesPerBag/numberOfServingsPerBag);
       int numberOfCookiesEaten;
       
       Scanner sncr = new Scanner (System.in);

       System.out.print("Enter the number of cookies eaten: ");
       numberOfCookiesEaten = sncr.nextInt();
       
       System.out.println("Number of total calories consumed: " + (caloriesPerCookie * numberOfCookiesEaten));
    }
}