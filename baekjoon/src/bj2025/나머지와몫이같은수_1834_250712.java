package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 3
// 8 2 2
// 4 1 1
// n * i + i
// 나머지 수가 N보다 작아야할듯
// 3 * 1 + 1 = 4
// 3 * 2 + 2 = 8
// 3 * 3 + 3 = 12 탈락
// 3 * 4 + 4 = 16

// 5
// 5 * 1 + 1 = 6
// 5 * 2 + 2 = 12
// 5 * 3 + 3 = 18
// 5 * 4 + 4 = 24
public class 나머지와몫이같은수_1834_250712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long sum = 0;
        for (long i = 1; i < N; i++) {
            sum += (N * i + i);
        }

        System.out.println(sum);
    }
}
