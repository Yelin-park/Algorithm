package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1번 집은 2번 집의 색과 같지 않아야 함
// N번 집의 색은 N-1번 집의 색과 같지 않아야 함
// i번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.
public class RGB거리_1149_250724 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 집의 수
        int[][] cost = new int[N][3]; // 행은 집의 수, 열은 RGB
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            cost[i][0] = Integer.parseInt(st.nextToken()); // R
            cost[i][1] = Integer.parseInt(st.nextToken()); // G
            cost[i][2] = Integer.parseInt(st.nextToken()); // B
        }

        int[][] dp = new int[N][3];
        dp[0][0] = cost[0][0]; // 처음 빨간색 집 비용
        dp[0][1] = cost[0][1]; // 처음 초록색 집 비용
        dp[0][2] = cost[0][2]; // 처음 파란색 집 비용
        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i][0]; // 다음 집을 빨간색으로 칠할 경우 그 전 집의 색칠 비용이 더 작은 초록집 또는 파란집
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + cost[i][1]; // 다음 집을 초록색으로 칠할 경우 그 전 집의 색칠 비용이 더 작은 빨간집 또는 파란집
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + cost[i][2]; // 다음 집을 파란색으로 칠할 경우 그 전 집의 색칠 비용이 더 작은 빨간집 또는 초록집
        }

        long result = Math.min(Math.min(dp[N-1][0], dp[N-1][1]), dp[N-1][2]);
        System.out.println(result);
    }
}
