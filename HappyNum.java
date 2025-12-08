import java.util.*;

class HappyNum {

    // Method to calculate sum of squares of digits
    public static int SumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit * digit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = y.nextInt();

        int slow = n;
        int fast = n;

        // Loop to detect cycle
        do {
            slow = HappyNum.SumOfSquares(slow);                        // slow moves 1 step
            fast = HappyNum.SumOfSquares(HappyNum.SumOfSquares(fast)); // fast moves 2 steps
        } while (slow != fast);

        // Check result
        if (slow == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not a Happy Number");
        }
    }
}
