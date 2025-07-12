package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 추론_1731_250712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;
        double a = (double) arr[arr.length - 1] / arr[arr.length - 2];
        if (a % 1 == 0.0) {
            result = (int) (arr[arr.length - 1] * a);
        } else {
            result =  arr[arr.length - 1] - arr[arr.length - 2] + arr[arr.length - 1];
        }

        System.out.println(result);
    }
}
