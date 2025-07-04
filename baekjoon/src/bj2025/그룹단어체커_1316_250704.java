package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹단어체커_1316_250704 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            char[] arr = str.toCharArray();
            StringBuilder sb = new StringBuilder();

            for (char c : arr) {
                if (sb.length() == 0) {
                    sb.append(c);
                } else {
                    if (sb.charAt(sb.length() - 1) == c && sb.indexOf(String.valueOf(c)) != -1) {
                        sb.append(c);
                    } else if (sb.indexOf(String.valueOf(c)) == -1) {
                        sb.append(c);
                    } else {
                        count = 0;
                        break;
                    }
                }
                count = 1;
            }

            sum += count;
        }

        System.out.println(sum);
    }
}
