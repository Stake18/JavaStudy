package Lab1;

import java.util.Scanner;

public class Experimental2_4 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		if (scan.hasNext()) 
		{
			int Minutes = (int) scan.nextInt();
			int Days = Minutes/1440;
			int Years = Days/365;
			Days = Days % 365;
			System.out.print(Minutes + " minutes is approximately " + Years + " years and " + Days + " days");
        }
        scan.close();
		
	}
}
