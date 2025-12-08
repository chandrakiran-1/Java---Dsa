import java.util.*;
class NumToWord
{
    public static void main(String[]args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter numbers :");
        String n= s.next();
        String[] words={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        for(int i=0; i<n.length();i++) {
            char c = n.charAt(i);
            int d= c-'0';
            System.out.println(words[d] + " ");

        }

    }
}