package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 명령프롬프트_1032_250716 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        char[] result = arr[0].toCharArray();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = 0; k < arr[i].length(); k++) {
                    if (result[k] != '?' && arr[i].charAt(k) != arr[j].charAt(k)) {
                        result[k] = '?';
                    }
                }
            }
        }

        System.out.println(result);
    }
}
