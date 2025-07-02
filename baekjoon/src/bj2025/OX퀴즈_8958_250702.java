package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX퀴즈_8958_250702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // v1
        /*for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split("");
            int score = 0;
            int sum = 0;

            for (String s : arr) {
                if (s.equals("O")) score++;
                else score = 0;
                sum += score;
            }

            sb.append(sum).append("\n");
        }*/

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int score = 0;
            int sum = 0;

            for (char c : str.toCharArray()) {
                if (c == 'O') score++;
                else score = 0;
                sum += score;
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
