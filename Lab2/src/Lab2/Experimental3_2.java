package Lab2;

import java.util.Scanner;

public class Experimental3_2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Enter the lenth from the center to a vertex: ");

        double lenth = scan.nextDouble(),s=2 * lenth * Math.sin( Math.PI / 5);

        double area;

        area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/5));

        System.out.println("The area of the pentagon is " + area);



        scan.close();
    }
}
