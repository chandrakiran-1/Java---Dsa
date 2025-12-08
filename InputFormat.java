import java.util.*;
class InputFormat
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number for the Conversion :");
        int n= sc.nextInt();
        String string= String.valueOf(n);
        string=string.replace('0','5');
        System.out.println("the number was Updated to 5's." + string);
    }
}