import java.util.*;
public class Papercut
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     int k=x%10;
     int n=x/10;
     System.out.println("maximum number of squares="+((n/k)*(n/k)));
    }
}