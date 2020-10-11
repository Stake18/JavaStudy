package Lab1;

import java.util.Scanner;

public class Experimental2_8 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double pounds = scanner.nextDouble();
		System.out.print("Enter height in inches: ");
		double inches = scanner.nextDouble();
		double height=inches* 0.0254;
		double BMI = pounds*0.45359237/Math.pow(height,2);
		System.out.println("BMI is "+BMI);
		scanner.close();
	}

}
