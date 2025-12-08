import java.util.*;
class Factorial
{
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a  Number: ");
        int n = s.nextInt();
        int num=1;
        for(int i=1; i<=n;i++)
        {
            num=num*i;
        }
        System.out.println("the factorial of given num : "+ num);
    }
}