import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextRound {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        String[] lineSplit = line.split(" ");
        int n = Integer.parseInt(lineSplit[0]);
        int k = Integer.parseInt(lineSplit[1]);
        String line2 = in.readLine();
        String[] lineSplit2 = line2.split(" ");
        int[] scores = new int[lineSplit2.length];

        for (int i = 0; i < lineSplit2.length; i++) {
            scores[i] = Integer.parseInt(lineSplit2[i]);
        }

        int kthScore = scores[k - 1];
        int num = 0;
        for (int i = 0; i < scores.length; i++) {
            if ((scores[i] >= kthScore) && (scores [i] > 0)) {
                num++;
            }
        }
        System.out.println(num);
        in.close();
    }
}
