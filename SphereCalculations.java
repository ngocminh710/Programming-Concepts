/*
  This program lets the user enter the radius of a sphere,
calculates, and outputs the area and volume.
*/

import java.util.Scanner;

public class SphereCalculations
{
      public static void main(String [] args) 
      {
      Scanner sncr = new Scanner (System.in);
      double sphereRadius;
      double sphereVolume;
      double sphereSurfaceArea;
      
      System.out.print("Enter the sphere's radius: ");
      sphereRadius = sncr.nextDouble();
      
      sphereVolume = (4.0/3) * Math.PI * Math.pow(sphereRadius,3);
      sphereSurfaceArea = 4 * Math.PI * Math.pow(sphereRadius,2);

      System.out.println("Volume: " + sphereVolume);
      System.out.println("Surface area: " + sphereSurfaceArea);
      }
}


