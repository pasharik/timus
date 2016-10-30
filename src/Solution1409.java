import java.util.Scanner;

/**
 * Created by pasharik on 30.10.16.
 */
public class Solution1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b;
        if (a > 0 && b > 0) {
            sum--;
        }

        int resultA = sum - a;
        int resultB = sum - b;
        System.out.println(resultA + " " + resultB);
    }
}
