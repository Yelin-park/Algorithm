package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 찍기_2966_250729 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] answer = br.readLine().toCharArray();
        String sanggeun = "ABC";
        String changyeong = "BABC";
        String hyunjin = "CCAABB";

        int adrian = 0; // 상근
        int bruno = 0; // 창영
        int goran = 0; // 현진
        for (int i = 0; i < N; i++) {
            if (answer[i] == sanggeun.charAt(i % sanggeun.length())) adrian++;
            if (answer[i] == changyeong.charAt(i % changyeong.length())) bruno++;
            if (answer[i] == hyunjin.charAt(i % hyunjin.length())) goran++;
        }

        int maxScore = Math.max(adrian, Math.max(bruno, goran));
        StringBuilder sb = new StringBuilder();
        sb.append(maxScore).append("\n");
        if (adrian == maxScore) sb.append("Adrian").append("\n");
        if (bruno == maxScore) sb.append("Bruno").append("\n");
        if (goran == maxScore) sb.append("Goran").append("\n");
        System.out.println(sb);
    }
}
