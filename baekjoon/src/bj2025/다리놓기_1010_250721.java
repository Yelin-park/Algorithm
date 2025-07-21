package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 3C2
 * = 3! / 1! * 2!
 * = 3! / 2!
 * = (3x2x1) / (2x1)
 * = 3
 * nCr = n! / (r! * (n - r)!)
 */
public class 다리놓기_1010_250721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            long result = comb(M, N);
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }

    // nCr 계산을 팩토리얼 없이 (곱셈-나눗셈 반복)
    public static long comb(int n, int r) {
        if (r == 0 || n == r) return 1;
        if (r > n - r) r = n - r; // nCr == nC(n-r)

        long result = 1;
        for (int i = 1; i <= r; i++) {
            result *= (n - r + i);
            result /= i;
        }
        return result;
    }

    /*public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long comb(int N, int M) {
        return factorial(M) / (factorial(N) * factorial(M - N));
    }*/
}
