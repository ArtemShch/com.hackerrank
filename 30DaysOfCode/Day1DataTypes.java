import java.util.Scanner;

/*
 Считывает с консоли int, double и string
 Выводит сумму int, double и string
 */
public class Day1DataTypes {
    public static void main (String[] args)
    {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

         /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        int x = scan.nextInt();
        double y = scan.nextDouble();
        scan.nextLine();
        String str = scan.nextLine();

        System.out.println(i + x);
        System.out.println(d + y);
        System.out.println(s + str);

        scan.close();
    }
}