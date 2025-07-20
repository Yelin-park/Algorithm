package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BABBA_9625_250720_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        int A = 1;
        int B = 0;
        for (int i = 0; i < K; i++) {
            int temp = B;
            B = A + B;
            A = temp;
        }

        result.append(A).append(" ").append(B);
        System.out.println(result);
    }
}
