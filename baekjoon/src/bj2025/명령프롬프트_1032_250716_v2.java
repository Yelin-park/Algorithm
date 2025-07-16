package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 명령프롬프트_1032_250716_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] files = new String[N];
        for (int i = 0; i < N; i++) {
            files[i] = br.readLine();
        }

        int length = files[0].length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char ch = files[0].charAt(i);
            boolean flag = false;

            for (int j = 1; j < N; j++) {
                if (ch != files[j].charAt(i)) {
                    flag = true;
                    break;
                }
            }
            result.append(flag ? ch : '?');
        }
        System.out.println(result);
    }
}
