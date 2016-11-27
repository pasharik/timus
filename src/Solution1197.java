import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pasharik on 30.10.16.
 * java Solution1197 < data/Solution1197.txt
 */
public class Solution1197 {
    private Integer n = 0;
    private List<String> inputList = new ArrayList<>();

    public static void main(String[] args) {
        Solution1197 solution = new Solution1197();
        solution.doRead();
        solution.process();
    }

    private void process() {
        List<Integer> result = new ArrayList<>(n);
        for (int i = 0; i<n; i++) {
            String s = inputList.get(i);
            result.add(solve(s.charAt(0), Integer.parseInt(s.substring(1))));
        }

        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));;
        for (int r : result) {
            out.println(r);
        }
        out.flush();
    }

    private void doRead() {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            n = in.nextInt();
        }
        while(in.hasNext()) {
            inputList.add(in.next());
        }
    }

    public static int solve(char a, int b) {
        int result = 2;
        if (b == 2 || b == 7) {
            result++;
        } else if (b > 2 && b < 7) {
            result += 2;
        }

        if (a == 'b' || a == 'g') {
            result = (b > 2 && b < 7) ? result + 2 : result + 1;
        } else if (a == 'c' || a == 'd' || a == 'e' || a == 'f') {
            if (b == 1 || b == 8) result += 2;
            if (b == 2 || b == 7) result += 3;
            if (b > 2 && b < 7) result += 4;
        }

        return result;
    }
}
