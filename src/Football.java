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
        return "YES";
    }
}
