package bj2025;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class 이항계수2_11051_250722 {
    static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        dp = new long[N + 1][K + 1];
        System.out.println(combi(N, K) % 10007);
    }

    public static long combi(int n, int r) {
        if (dp[n][r] > 0) return dp[n][r];
        if (n == r || r == 0) return dp[n][r] = 1;

        return dp[n][r] = (combi(n - 1, r - 1) + combi(n - 1, r)) % 10007;
        //return dp[n][r] = (combi(n - 1, r - 1) % 10007) + (combi(n - 1, r) % 10007);
    }
}
