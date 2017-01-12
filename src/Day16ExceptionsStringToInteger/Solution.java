package Day16ExceptionsStringToInteger;
/*
test
Sample Input 0

3

Sample Output 0

3

Sample Input 1

za

Sample Output 1

Bad String

 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try
        {
            int a = Integer.parseInt(S);
            System.out.println(a);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Bad String");
        }
    }
}