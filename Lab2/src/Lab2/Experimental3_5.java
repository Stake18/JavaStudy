package Lab2;

public class Experimental3_5 {
    public static void main(String[] args) {
        int i,temp=120;
        while (temp<=1000)
        {
            for (i=0;i<10;i++)
            {
                System.out.print(temp + " ");
                temp=temp+30;
            }
            System.out.println();
        }
    }
}
