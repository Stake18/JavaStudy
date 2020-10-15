package Lab2;

import java.util.Scanner;

public class Experimental3_4 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Entr string s1: ");
        String Input1 = scan.nextLine();
        System.out.printf("Entr string s2: ");
        String Input2 = scan.nextLine();
        scan.close();
        int lenth1=Input1.length(),lenth2=Input2.length(),i,flag=0;
        for (i=0;i<=lenth1-lenth2-1;i++)
        {
            if (Input1.contains(Input2))
            {
                flag=1;
            }
        }
        if (flag==1)
        {
            System.out.println(Input2 + " is a substring of " + Input1);
        }
        else
        {
            System.out.println(Input2 + " is not a substring of " + Input1);
        }

    }
}
