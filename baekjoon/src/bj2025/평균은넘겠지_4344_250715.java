package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균은넘겠지_4344_250715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 첫째 줄은 테스트 케이스
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int studentCount = Integer.parseInt(st.nextToken());
            int[] score = new int[studentCount];
            double avg = 0;
            for (int j = 0; j < score.length; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                avg += score[j];
            }

            avg /= score.length; // 평균 구하기

            double count = 0;
            for (int j : score) {
                if (avg < j) count++; // 평균보다 큰 학생 점수가 있는 경우
            }
            String percent = String.format("%.3f",(count / studentCount) * 100);
            sb.append(percent).append("%\n");
        }

        System.out.println(sb);
    }
}
