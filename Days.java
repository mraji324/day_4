
import java.util.*;
public class Days
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch(day)
        {
            case1:
            System.out.println("sunday");
            break;
            case2:
            System.out.println("monday");
            break;
            case3:
            System.out.println("tuesday");
            break;
            case4:
            System.out.println("wednesday");
            break;
            case5:
            System.out.println("thursday");
            break;
           case6:
            System.out.println("friday");
            break;
            case7:
            System.out.println("saturday");
            break;
            default:
                System.out.println("invalid number");
                break;
        }
    }
}