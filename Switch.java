import java.util.*;
public class Switch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        switch(age<=18)
        {
            case1:
            System.out.println("you are eligible");
            break;
            case2:
            System.out.println("you are not eligible");
            break;
        }
    }
}