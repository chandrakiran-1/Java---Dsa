import java.util.*;
class ReverseNum
{
    public static void main(String[] args)
    {
        Scanner x= new Scanner(System.in);
        System.out.println("Enter a number to reverse :");
        int num= x.nextInt();
        int rev=0;
        while(num>0)
        {
            int digit=num%10;
            rev= rev*10+ digit;
            num=num/10;
        }
        System.out.println("the Reverse num is : " + rev);
    }
}