package bj2025;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class 조합_2407_250721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        System.out.println(combi(n, m));
    }

    static BigInteger combi(int n, int r) {
        if (n == r) return BigInteger.ONE;
        if (r > n - r) r = n - r;

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= r; i++) {
            result = result.multiply(BigInteger.valueOf(n - r + i));
            result = result.divide(BigInteger.valueOf(i));
        }

        return result;
    }
}