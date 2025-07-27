package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주사위게임_2476_250727_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int max = 0;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == b && b == c) {
                max = Math.max(max, 10000 + a * 1000);
            } else if (a == b || a == c) {
                max = Math.max(max, 1000 + a * 100);
            } else if (b == c) {
                max = Math.max(max, 1000 + b * 100);
            } else {
                int x = Math.max(a, Math.max(b, c));
                max = Math.max(max, x * 100);
            }
        }

        System.out.println(max);
    }
}
