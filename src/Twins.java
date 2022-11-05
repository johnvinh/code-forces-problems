import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Twins {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] coinValueStrings = in.readLine().split(" ");
        ArrayList<Integer> coinValues = new ArrayList<>();
        for (int i = 0; i < coinValueStrings.length; i++) {
            coinValues.add(Integer.parseInt(coinValueStrings[i]));
        }
        in.close();
    }

    private static int solve() {
        return 0;
    }
}
