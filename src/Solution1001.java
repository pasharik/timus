import java.io.*;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by pasharik on 30.10.16.
 *
 * How to run:
 * java Solution1001 < 1.txt
 */
public class Solution1001 {
    PrintWriter out;
    Stack<Long> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        new Solution1001().run();
    }

    void solve() throws IOException {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLong()) {
            stack.add(in.nextLong());
        }

        while (!stack.empty()) {
            Long next = stack.pop();
            out.printf("%.4f", Math.sqrt(next));
            out.println();
        }
    }

    void run() throws IOException {
        out = new PrintWriter(new OutputStreamWriter(System.out));
        solve();
        out.flush();
    }
}
