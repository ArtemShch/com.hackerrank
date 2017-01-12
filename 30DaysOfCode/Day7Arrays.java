import java.util.Scanner;

/*
 Print the elements of array in reverse order as a single line of space-separated numbers.
 Sample Input

4
1 4 3 2

Sample Output

2 3 4 1

 */
public class Day7Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for(int i=0; i < n; i++){
            System.out.print(arr[n - i - 1] + " ");
        }
        in.close();
    }
}
