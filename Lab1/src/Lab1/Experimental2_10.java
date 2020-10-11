package Lab1;

import java.util.Scanner;

public class Experimental2_10 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter investment amount: ");
		double investment = scanner.nextDouble();
		System.out.println("Enter annual interest rate in percentage: ");
		double rate = scanner.nextDouble();
		System.out.println("Enter number of year: ");
		double year = scanner.nextDouble();
		double monthlyrate=rate/100/12;
		double value = investment*Math.pow((1+monthlyrate), year*12);
		System.out.println("Accumulated value is "+value);
		scanner.close();

	}

}
