package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 메모리 초과
 */
public class BABBA_9625_250720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        String[] arr = new String[K+1];
        arr[0] = "A";
        for (int i = 1; i <= K; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < arr[i-1].length(); j++) {
                if (arr[i-1].charAt(j) == 'A') sb.append("B");
                else sb.append("BA");
            }
            arr[i] = sb.toString();
        }

        StringBuilder result = new StringBuilder();
        int A = 0;
        int B = 0;
        for (char c : arr[K].toCharArray()) {
            if (c == 'A') A++;
            else if (c == 'B') B++;
        }
        result.append(A).append(" ").append(B);

        System.out.println(result);
    }
}
