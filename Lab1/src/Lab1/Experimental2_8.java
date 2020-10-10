package Lab1;

import java.util.Scanner;

public class Experimental2_8 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit between -58 F and 41 F: ");
		double Temper = (double) scan.nextFloat();
		System.out.print("Enter the wind speed miles per hour (>=2) : ");
		double V = (double) scan.nextFloat();
        double Twc;
        Twc = 35.74 + 0.6215 * Temper -35.75 * Math.pow(V, 0.16) + 0.4275 * Temper * Math.pow(V, 0.16);
        
		
		System.out.println("The wind chill index is " + Twc);
        scan.close();
		
	}

}
