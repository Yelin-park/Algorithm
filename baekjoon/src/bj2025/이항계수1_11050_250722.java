package bj2025;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class 이항계수1_11050_250722 {
    public static int N, K;
    public static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        dp = new int[N+1][K+1];
        System.out.println(combi(N, K));
    }

    // 곱셉/나눗셈 반복
    static int combi(int n, int r) {
        if (n == r || n == 0) return 1;
        if (r > n - r) r = n - r;
        int result = 1;

        for (int i = 1; i <= r; i++) {
            result *= (n - r + i);
            result /= i;
        }

        return result;
    }

    // 파스칼 삼각형
    /*public static int combi(int n, int r) {
        if (dp[n][r] > 0) return dp[n][r];
        if (r == 0 || n == r) return dp[n][r] = 1;

        return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }*/
}

