package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단오르기_2579_250724 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stairs = Integer.parseInt(br.readLine()); // 계단 개수
        int[] scores = new int[stairs + 1];
        for (int i = 1; i <= stairs; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[stairs + 1];
        dp[1] = scores[1];
        if (stairs >= 2) dp[2] = scores[1] + scores[2];
        if (stairs >= 3) dp[3] = Math.max(scores[1] + scores[3], scores[2] + scores[3]);
        for (int i = 3; i <= stairs; i++) {
            dp[i] = Math.max(dp[i - 2] + scores[i],
                dp[i - 3] + scores[i - 1] + scores[i]);
        }

        System.out.println(dp[stairs]);
    }
}
