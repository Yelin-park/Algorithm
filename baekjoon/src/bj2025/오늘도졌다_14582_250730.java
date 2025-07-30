package bj2025;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class 오늘도졌다_14582_250730 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        boolean flag = false;
        int scoreA = 0; // 울림 제미니스
        int scoreB = 0; // 스타트링크 걸리버스
        for (int i = 0; i < 9; i++) {
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            scoreA += a;
            if (scoreA > scoreB) flag = true;
            scoreB += b;
        }

        System.out.print(flag ? "Yes" : "No");
    }
}
