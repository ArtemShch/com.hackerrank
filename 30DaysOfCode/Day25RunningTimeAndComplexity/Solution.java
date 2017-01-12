package Day25RunningTimeAndComplexity;


import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++)
        {
            BigInteger n = in.nextBigInteger();
            // очень быстро проверяем является ли число простым
            String str = n.isProbablePrime(1) ? "Prime" : "Not prime";
            System.out.println(str);
        }
    }
}
