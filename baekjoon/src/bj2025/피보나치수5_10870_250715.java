package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수5_10870_250715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        fibonacci(n);
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

    // 공간 복잡도를 O(1)로 줄인 동적 계획법을 활용한 코드
    public static int fiboFast(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int prev = 0;  // F(0)
        int curr = 1;  // F(1)

        for (int i = 2; i <= n; i++) {
            int next = prev + curr;  // F(i) = F(i-1) + F(i-2)
            prev = curr;             // prev를 한 칸 앞으로
            curr = next;             // curr를 한 칸 앞으로
        }

        return curr;
    }
}
