import java.util.Scanner;

/*
 Write a factorial function that takes a n positive integer, as a parameter and prints the result of n!.
 */
public class Recursion {
    private static long factorial(int n){
        if (n <= 1) return 1;

        return n * (factorial(n - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        System.out.println(factorial(n));
    }
}
