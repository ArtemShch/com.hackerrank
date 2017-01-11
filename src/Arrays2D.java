import java.util.Scanner;

/*
    There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array ;
    every value in the inclusive range of 9 to -9.

    Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
    A's graphical representation:
    a b c
      d
    e f g
 */
public class Arrays2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        int max = -63;
        for (int x = 1; x < 5; x++)
            for (int y = 1; y < 5; y++)
                max = Math.max(max, arr[x - 1][y - 1] + arr[x - 1][y]
                        + arr[x - 1][y + 1] + arr[x][y]
                        + arr[x + 1][y - 1] + arr[x + 1][y]
                        + arr[x + 1][y + 1]);

        System.out.println(max);
    }
}
