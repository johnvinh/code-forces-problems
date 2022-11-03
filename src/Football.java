import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Football {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solve(in.readLine()));
        in.close();
    }

    private static String solve(String input) {
        int counter = 1;
        char prev = 'A';
        for (int i = 0; i < input.length(); i++) {
            if (counter >= 7) {
                return "YES";
            }
            char ch = input.charAt(i);
            if (ch == prev) {
                counter += 1;
            } else {
                counter = 1;
            }
            prev = ch;
        }
        if (counter >= 7) {
            return "YES";
        }
        return "NO";
    }
}
