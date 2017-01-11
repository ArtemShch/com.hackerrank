import java.util.Scanner;

/*
 Given an integer, , perform the following conditional actions:

    If is odd, print Weird
    If is even and in the inclusive range 2 of 5 to , print Not Weird
    If is even and in the inclusive range of 6 to 20 , print Weird
    If is even and greater than 20 , print Not Weird

Complete the stub code provided in your editor to print whether or not is weird.
 */
public class Day3IntroToConditionaStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = "Weird";
        }
        else{
            if (n >= 2 && n <= 5 || n > 20)
                ans = "Not Weird";
            else if (n >= 6 && n <= 20)
                ans = "Weird";
            // Complete the code
        }
        System.out.println(ans);
    }
}
