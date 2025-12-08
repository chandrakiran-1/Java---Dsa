import java.util.*;
class SumOfDigits
{
    public static void main(String[]args)
    {
        Scanner x= new Scanner(System.in);
        System.out.println("Enter a number :");
        int n= x.nextInt();
        int sum=0;
        while(n>0) {
            int digit = n % 10;
            sum += digit;
            n/=10;

        }
        System.out.println("the Sum of the Digits is :"+sum);
    }
}