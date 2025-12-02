import java.util.*;
class ReverseNumber
{
    public static void main(String[]args)
    {
        Scanner chandu= new Scanner(System.in);
        System.out.println("Enter a number to Reverse :");
        int number = chandu.nextInt();
        int rev=0;
        while(number != 0)
        {
            int LastNumber = number %10;
            rev= rev*10+LastNumber;
            number= number/10;
        System.out.println("Reverse Number :"+ rev);
        }
    }
}