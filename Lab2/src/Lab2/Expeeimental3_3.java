package Lab2;

import java.util.Scanner;

public class Expeeimental3_3 
{
    public static void main(String[] args) 
    {
        System.out.printf("Entr a string: ");
        Scanner scan = new Scanner(System.in);
        String Input = scan.nextLine();
        int lenth=Input.length();
        System.out.println("The lenth of the string is " + lenth);
        System.out.println("The last character in the string is " + Input.charAt(lenth-1));

        scan.close();
    }
    
}
