package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 3 4 5 6 -> 18
// 3 4 5 6 7 -> 25
// 2 1 0 -1 -> 2
public class 시그마_2355_250719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long start = Math.min(A, B);
        long end = Math.max(A, B);
        long count = end - start + 1; // 항의 개수
        long result = (start + end) * (count / 2);

        if (count % 2 != 0) { // 수의 개수가 홀수
            result += (start + end) / 2;
        }
        System.out.print(result);
    }
}
