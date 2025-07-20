package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BABBA_9625_250720_v3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int[] dp = new int[46];

        dp[1] = 1;
        for (int i = 2; i <= 45; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        System.out.printf("%d %d", dp[K - 1], dp[K]);
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        long[] dp = new long[K + 1];
        dp[1] = 1;
        for (int i = 2; i <= K; i++)
            dp[i] = dp[i - 2] + dp[i - 1];
        System.out.printf("%d %d", dp[K - 1], dp[K]);*/
    }
}
