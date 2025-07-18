package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 0층은 i호에 i명이 산다. (ex. 1호 1명, 2호 2명...)
 * a층 b호에 살려면 a-1층의 1호부터 b호까지 사람들의 수의 합만큼 거주
 * k는 층, n은 호
 * 0층  1  2  3   4   5   6  7  8  9  10  11  12  13  14
 * 1층  1  3  6   10  15  21
 * 2층  1  4  10  20  35
 */
public class 부녀회장이될테야_2775_250718_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[][] arr = new int[15][15];
        for (int i = 1; i < 15; i++) { // 0층 초기화
            arr[0][i] = i;
        }

        for (int i = 1; i < 15; i++) { // 1층부터 14층 초기화
            for (int j = 1; j < 15; j++) {
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[k][n]).append("\n");
        }

        System.out.println(sb);
    }
}
