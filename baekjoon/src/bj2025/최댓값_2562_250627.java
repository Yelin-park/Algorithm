package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최댓값_2562_250627 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idx = 0;
        int max = 0;
        for (int i = 1; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            if (max < n) {
                max = n;
                idx = i;
            }
        }

        System.out.println(max);
        System.out.println(idx);

    }
}