import java.util.Scanner;

/*
 Given a base-10 integer, , convert it to binary (base-2).
 Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.

 Explanation:
 The binary representation of 13 is 1101, so the maximum number of consecutive 1's is 2.
*/
public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String res = Integer.toString(n, 2);

        String[] arr = res.split("0");
        int max = 0;
        for (String anArr : arr) {
            max = Math.max(max, anArr.length());
        }

        System.out.println(max);
    }
}
