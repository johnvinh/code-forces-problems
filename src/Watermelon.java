import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(in.readLine());
        boolean result = solve(number);
        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        in.close();
    }

    private static boolean solve(int n) {
        for (int i = 1; i < n; i++) {
            int number = n - i;
            if ((number % 2 == 0) && (i % 2 == 0)) {
                return true;
            }
        }
        return false;
    }
}