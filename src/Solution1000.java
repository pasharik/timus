import java.io.*;

/**
 * Created by pasharik on 30.10.16.
 */
public class Solution1000 {
    StreamTokenizer in;
    PrintWriter out;

    public static void main(String[] args) throws IOException {
        new Solution1000().run();
    }

    void solve() throws IOException {
        int a = nextInt();
        int b = nextInt();
        out.println(a + b);
    }

    void run() throws IOException {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        solve();
        out.flush();
    }

    int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }
}
