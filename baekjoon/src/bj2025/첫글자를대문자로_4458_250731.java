package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 첫글자를대문자로_4458_250731 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            char[] charArray = br.readLine().toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                if (j == 0) sb.append(String.valueOf(charArray[j]).toUpperCase());
                else sb.append(charArray[j]);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
