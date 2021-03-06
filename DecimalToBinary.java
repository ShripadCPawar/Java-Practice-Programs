import java.util.Scanner;

public class DecimalToBinary
{
    public static void main(String[] args) 
    {
        int n, count = 0, a;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any Decimal number:");
        n = s.nextInt();
        while(n > 0)
        {
            a = n % 2;
            if(a == 1)
            {
                count++;
            }
            x = a + "" + x;
            n = n / 2;
        }
        System.out.println("Binary number:"+x);
        System.out.println("No. of 1s:"+count);
    }
}


/* 

To Run :
$ javac DecimalToBinary.java
$ java Convert

Output : 

Enter any decimal number:25
Binary number:11001
No. of 1s:3

*/
