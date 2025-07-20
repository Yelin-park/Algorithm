package bj2025;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수고르기_2230_250720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        int start = 0, end = 0;
        while (end < N && start < N) {
            int dif = arr[end] - arr[start];
            if (dif < M) end++;
            else {
                min = Math.min(min, dif);
                start++;
            }
        }

        System.out.println(min);
    }
}
