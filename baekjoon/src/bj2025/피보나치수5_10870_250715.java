package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수5_10870_250715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 동적 계획법
        int[] dp = new int[n + 1];
        dp[0] = 0;
        if (n > 0) dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[n]);
    }

    // 재귀 함수
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
