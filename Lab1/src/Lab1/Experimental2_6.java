package Lab1;

import java.util.Scanner;

public class Experimental2_6 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms: ");
		double Amount = (double) scan.nextFloat();
		System.out.print("Enter the initial temperature: ");
		double Initial = (double) scan.nextFloat();
		System.out.print("Enter the final temperature: ");
		double Final = (double) scan.nextFloat();
		double Energy = Amount * (Final - Initial) * 4184;
        
		
		System.out.println("The energy needed is " + Energy);
        scan.close();
		
	}

}
