package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 점수계산_2822_250723_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] scores = new int[8][2];
        for (int i = 0; i < 8; i++) {
            scores[i][0] = i + 1;
            scores[i][1] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(scores, (a, b) -> b[1] - a[1]);

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int[] top = new int[5];
        for (int i = 0; i < 5; i++) {
            sum += scores[i][1];
            top[i] = scores[i][0];
        }

        sb.append(sum).append("\n");
        Arrays.sort(top);

        for (int idx : top) {
            sb.append(idx).append(" ");
        }

        System.out.println(sb);
    }
}
