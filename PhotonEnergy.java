/*
  This program accepts the wavelength of a photon and lets the user
calculate its frequency and energy using the formulae provided.
*/

import java.util.Scanner;

public class PhotonEnergy
{
      public static void main(String [] args) 
      {
      Scanner sncr = new Scanner (System.in);
      final double h = 6.626e-34;
      final double c = 3e+8;
      double photonWavelength;
      double photonFrequency;
      double photonEnergy;

      System.out.print("Enter the wavelength of the photon (in m): ");
      photonWavelength = sncr.nextDouble();
      
      photonFrequency = c / photonWavelength;
      photonEnergy = h * photonFrequency;

      System.out.println("The frequency of the photon is " + photonFrequency + " Hertz.");
      System.out.println("The energy of the photon is " + photonEnergy + " Joules.");
      }
}