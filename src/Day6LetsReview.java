import java.util.Scanner;

/*
 Sample Input

 2
 Hacker
 Rank

 Sample Output

 Hce akr
 Rn ak

 */
public class Day6LetsReview {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String str;
        for (int i = 0; i < n; i++)
        {
            str = scanner.nextLine();

            StringBuilder stringBuilder1 = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder();
            for (int x = 0; x < str.length(); x+=2)
            {
                stringBuilder1.append(str.charAt(x));
                if (x + 1 < str.length())
                stringBuilder2.append(str.charAt(x + 1));
            }

            System.out.println(stringBuilder1.append(" ").append(stringBuilder2));
        }

        scanner.close();
    }
}
