package Lab1;

import java.util.Scanner; 

public class Experimental2_2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a temperature in Celsius:");
		if (scan.hasNext()) 
		{
            double Cel = (double) scan.nextFloat(),Fahr;
            Fahr=Cel*1.8+32;
            System.out.println(Cel + " Celsius is " + Fahr + " Fahrenheit");
        }
        scan.close();
		
	}
}
