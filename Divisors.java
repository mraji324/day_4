import java.util.*;
public class Divisors
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<=5;i++)
            {
                if(n%i==0)
                System.out.println(i);
            }
    }
}