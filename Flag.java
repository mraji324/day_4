import java.util.*;
public class Flag
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int flag=0;
        if(a>=18)
        flag=1;
        switch(flag)
        {
            case0:
            System.out.println("you are not eligible");
            break;
            case1:
            System.out.println("you are eligible");
            break;
        }
    }
}