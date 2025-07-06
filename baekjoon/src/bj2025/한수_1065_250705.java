package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1부터 N까지 한수의 개수를 세는 문제
 */
public class 한수_1065_250705 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        if (N < 100) count = N;
        else {
            count = 99;
            for (int i = 100; i <= N; i++) {
                int a = i / 100;
                int b = (i / 10) % 10;
                int c = i % 10;

                if ((a - b) == (b - c)) count++;
            }
        }

        System.out.println(count);
    }
}
