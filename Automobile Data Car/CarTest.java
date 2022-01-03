/*
  This program lets the user create driver programs for automobile data. 
*/

import java.util.Scanner;
public class CarTest
{   
   public static void main (String [] args)   
   {      
      Scanner sncr = new Scanner(System.in);
      Car car1 = new Car("Ford", "Taurus", 2019);  
      Car car2 = new Car("Honda", "Accord", 2007);     
      Car car3 = new Car();
   
      System.out.println("Here is the information I have on Mr. Smith's cars: ");
      System.out.println(car1.toString());
      System.out.println(car2.toString());
      System.out.println(car3.toString());   
      
      String carMake;
      String carModel;
      int carYear;
      
      System.out.println("\nWhoops! It seems we do not have the info on one of his cars!\n"
                         + "Enter the missing information for the car here:");
      System.out.print("Make: ");
      carMake = sncr.nextLine();
      System.out.print("Model: ");
      carModel = sncr.nextLine();
      System.out.print("Year: ");
      carYear = sncr.nextInt();
      car3.setCarMake(carMake);
      car3.setCarModel(carModel);
      car3.setCarYear(carYear); 
           
      System.out.print("Mr. Smith wants to trade the " + car1.getCarModel() +
                          " for another " + car1.getCarMake() + " from the same year.\n"
                         + "Enter the new " + car1.getCarMake() + " model: ");
      sncr.nextLine();
      carModel = sncr.nextLine();
      car1.setCarModel(carModel);
      
      System.out.print("Mr. Smith wants to sell the " + car2.getCarYear() + " " +
                          car2.getCarModel() + " to buy a more current version.\n"
                         + "Enter the new year for the " + car2.getCarModel() + " : ");
      carYear = sncr.nextInt();
      car2.setCarYear(carYear);
            
      System.out.println("\nHere is the updated information I now have on Mr. Smith's cars: ");
      System.out.println(car1.toString());
      System.out.println(car2.toString());
      System.out.println(car3.toString());        
   }
}