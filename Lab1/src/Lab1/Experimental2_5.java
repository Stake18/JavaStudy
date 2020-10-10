package Lab1;

import java.util.Scanner;

public class Experimental2_5 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter v0, v1, and t: ");
		if (scan.hasNext()) 
		{
            double v0 = (double) scan.nextFloat(),v1 = (double) scan.nextFloat(),time = (double) scan.nextFloat();
            double accel = (v1-v0) / time;
            System.out.println("The average acceleration is "+accel);
        }
        scan.close();
		
	}
}
