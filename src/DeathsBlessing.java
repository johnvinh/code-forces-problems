// https://codeforces.com/problemset/problem/1749/B

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class DeathsBlessing {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        // t test cases
        for (int i = 0; i < t; i++) {
            // number of monsters
            int n = Integer.parseInt(in.readLine());
            // health of monsters
            ArrayList<Integer> healths = new ArrayList<>();
            String[] healthStrings = in.readLine().split(" ");
            for (int j = 0; j < healthStrings.length; j++) {
                healths.add(Integer.parseInt(healthStrings[j]));
            }
            // spell strengths of monsters
            ArrayList<Integer> spellStrengths = new ArrayList<>();
            String[] spellStrings = in.readLine().split(" ");
            for (int j = 0; j < spellStrings.length; j++) {
                spellStrengths.add(Integer.parseInt(spellStrings[j]));
            }
        }
        in.close();
    }

    private int solve(ArrayList<Integer> monsterHealth, ArrayList<Integer> spellStrength) {
        return 0;
    }
}
