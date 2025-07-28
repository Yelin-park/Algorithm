package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 오르막길_2846_250728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < i + 2; j++) {
                int p1 = arr[i];
                int p2 = arr[j];
                if (p1 >= p2) {
                    max = Math.max(max, sum);
                    sum = 0;
                    break;
                }
                sum += p2 - p1;
            }
        }
        max = Math.max(max, sum);

        System.out.println(max);
    }
}
