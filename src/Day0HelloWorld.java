import java.util.Scanner;

/*
 Считывает строку с консоли
 И выводит
 Hello, World.
 и считанную строку с консоли
 */
public class Day0HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, inputString.
        String inputString = scan.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");
        System.out.println(inputString);
        //15313131351351351313151351351351313515313
    }
}
