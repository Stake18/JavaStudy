package Lab1;

import java.util.Scanner;

public class Experimental2_7 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter monthly saving amount: ");
        double Amount = (double) scan.nextFloat();
        double Result = 0;
        int i=1;
        while (i<=6)
        {
            Result = (Result+Amount) * 1.00417;
            i++;
        }
		
		
		System.out.println("After the sixth month, the account value is " + Result);
        scan.close();
		
	}

}
