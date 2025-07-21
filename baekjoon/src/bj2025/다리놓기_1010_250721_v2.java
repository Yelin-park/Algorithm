package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 3C2
 * = 3! / 1! * 2!
 * = 3! / 2!
 * = (3x2x1) / (2x1)
 * = 3
 * n읜 전체 원소 개수, r은 선택할 원소의 개수
 * nCr = n! / (r! * (n - r)!)
 */
public class 다리놓기_1010_250721_v2 {
    static int[][] dp = new int[30][30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(combi(M, N)).append("\n");
        }

        System.out.println(sb);
    }

    static int combi(int m, int n) {
        if (dp[m][n] > 0) {
            return dp[m][n];
        }

        if (m == n || n == 0) {
            return dp[m][n] = 1;
        }

        return dp[m][n] = combi(m - 1, n - 1) + combi(m - 1, n);
    }
}
