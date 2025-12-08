    import java.util.*;
    class StringEx
    {
        public static void main(String[]args)
        {
            Scanner x= new Scanner(System.in);
            System.out.println("Enter to Coversion a String :");
            String string=x.nextLine();
            System.out.println("the String is converted into UpperCase : "+ string.toUpperCase());
            System.out.println("the String is converted into LowerCase : " + string.toLowerCase());
        }
    }