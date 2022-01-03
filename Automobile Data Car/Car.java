/*
  This program lets the user create classes for automobile data. 
*/

public class Car
{
   private String carMake;
   private String carModel;
   private int carYear;
   
   public Car (String make, String model, int year)
   {
      carMake = make;
      carModel = model;
      carYear = year;
   }
   
   public Car ()
   {
      carMake = "-";
      carModel = "-";
      carYear = 0;
   }
   
   public String getCarMake()
   {
      return carMake;
   }
   
   public String getCarModel()
   {
      return carModel;
   }
   
   public int getCarYear()
   {
      return carYear;
   }
   
   public void setCarMake(String m)
   {
      carMake = m;
   }
   
   public void setCarModel(String n)
   {
      carModel = n;
   }
   
   public void setCarYear(int y)
   {
      carYear = y;
   }
   
   public String toString()   
   {      
      return (carYear + "\t\t\t" + carMake + "\t\t\t" + carModel);    
   }   
}
    
