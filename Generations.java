/*
  This program asks the user to enter a birth year, then indicates 
which generation a person of that year belongs/would have belonged to.
*/

import java.util.Scanner;

public class Generations
{
   public static void main(String[] args) 
   {
       Scanner input = new Scanner(System.in);
       int birthYear;
       
       System.out.print("Enter a year: ");
       birthYear=input.nextInt();
       
       while (birthYear<=1883 || birthYear>=2020){
       System.out.println("Sorry, that year is not within a valid range.");
       System.out.print("Re-enter a year: ");
       birthYear=input.nextInt();
       }
       
       if(birthYear>=1883 && birthYear<=1900){
         System.out.println("You are part of The Lost Generation.");
       }
       else if(birthYear>=1901 && birthYear<=1927){
         System.out.println("You are part of The Greatest Generation.");
       }
       else if(birthYear>=1928 && birthYear<=1945){
         System.out.println("You are part of Silent Generation.");
       }
       else if(birthYear>=1946 && birthYear<=1964){
         System.out.println("You are part of Baby Boomers.");
       }
       else if(birthYear>=1965 && birthYear<=1980){
         System.out.println("You are part of Generation X.");
       }
       else if(birthYear>=1981 && birthYear<=1996){
         System.out.println("You are part of Millennial.");
       }
       else if(birthYear>=1997 && birthYear<=2012){
         System.out.println("You are part of Generation Z.");
       }
       else if(birthYear>=2013 && birthYear<=2020){
         System.out.println("You are part of Generation Alpha.");
       }
   }
}