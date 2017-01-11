import java.util.Scanner;

/*
 * Created by Артем on 11.01.2017.
 */
public class Day2Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost * (1 + (taxPercent + tipPercent)/100.0));

        // Print your result
        System.out.printf("The total meal cost is %d dollars.", totalCost);
    }
}