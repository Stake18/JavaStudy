package Lab1;

import java.util.Scanner;

public class Experimental2_3 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 1000: ");
		if (scan.hasNext()) 
		{
            int Input = (int) scan.nextInt(),Sum=0;
            int Temp1=Input,Temp2;
            while (Temp1>0) 
            {
            	Temp2=Temp1 % 10;
            	Sum=Sum+Temp2;
            	Temp1=Temp1/10;
            }
            System.out.print("The sum of all digits in "+ Input + " is " + Sum);
        }
        scan.close();
	}
}
