import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WayTooLongWords {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        // n test cases
        String[] out = new String[n];
        for (int i = 0; i < n; i++) {
            String testCase = in.readLine();
            out[i] = solve(testCase);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(out[i]);
        }
        in.close();
    }

    private static String solve(String testCase) {
        if (testCase.length() <= 10) {
            return testCase;
        }
        StringBuilder out = new StringBuilder();
        out.append(testCase.charAt(0));
        out.append(testCase.length() - 2);
        out.append(testCase.charAt(testCase.length() - 1));
        return out.toString();
    }
}