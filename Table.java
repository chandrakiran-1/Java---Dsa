import java.util.*;
class Table
{
    public static void main(String[]args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println(" Enter a Number :");
        int n= s.nextInt();
            for (int i=1; i<13;i++)
        {
            System.out.println(n + " X " + i + " = " +  (n*i) );
        }

    }
}