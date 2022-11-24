import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitPlusPlus {
    public static void main(String[] args) {
        int x = 0;
        try (InputStreamReader is = new InputStreamReader(System.in); BufferedReader in = new BufferedReader(is)) {
            int n = Integer.parseInt(in.readLine());
            for (int i = 0; i < n; i++) {
                String line = in.readLine();
                if (line.contains("++")) {
                    x++;
                } else if (line.contains("--")) {
                    x--;
                }
            }
        } catch (IOException ignored) {

        }
        System.out.println(x);
    }
}
