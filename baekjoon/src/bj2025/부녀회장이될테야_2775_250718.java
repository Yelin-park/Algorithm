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
public class 부녀회장이될테야_2775_250718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine()); // 층
            int n = Integer.parseInt(br.readLine()); // 호

            int[][] arr = new int[k][15];
            int result = 0;
            for (int j = 0; j < k; j++) { // k층까지돌기
                for (int l = 1; l <= n; l++) { // 해당하는 호수 다 돌기
                    int sum = 0;
                    for (int m = 1; m <= l; m++) {
                        if (j != 0) {
                            sum += arr[j - 1][m];
                        } else {
                            sum = m;
                        }
                    }
                    arr[j][l] = sum;
                    if (j == k - 1) result += sum;
                }
            }
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
