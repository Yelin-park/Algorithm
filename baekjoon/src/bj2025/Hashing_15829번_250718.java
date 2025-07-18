package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * abcde
 * 1 * 31^0 + 2 * 31^1 + 3 * 31^3 + 4 * 31^4 + 5 * 31^5 = 1 + 62 + 2883 + 119164 + 4617605 = 4739715
 */
public class Hashing_15829번_250718 {
    public static void main(String[] args) throws IOException {
        long r = 31;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        char[] charArray = br.readLine().toCharArray();
        BigInteger M = BigInteger.valueOf(1234567891);
        BigInteger sum = BigInteger.ZERO;
        BigInteger hash = BigInteger.ONE;
        for (int i = 0; i < L; i++) {
            sum = sum.add(BigInteger.valueOf(charArray[i] - 'a' + 1).multiply(hash));
            hash = hash.multiply(BigInteger.valueOf(r));
            sum = sum.mod(M);
        }

        System.out.println(sum.mod(M));
    }
}
