import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Team {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int implementedProblems = 0;
        for (int i = 0; i < n; i++) {
            String line = in.readLine();
            String[] numbers = line.split(" ");
            int num1 = Integer.parseInt(numbers[0]);
            int num2 = Integer.parseInt(numbers[1]);
            int num3 = Integer.parseInt(numbers[2]);
            boolean result = solve(num1, num2, num3);
            if (result) {
                implementedProblems++;
            }
        }
        System.out.println(implementedProblems);
        in.close();
    }

    private static boolean solve(int num1, int num2, int num3) {
        return (num1 + num2 + num3) >= 2;
    }
}