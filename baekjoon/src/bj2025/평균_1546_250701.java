package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균_1546_250701 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scores = new int[count];

        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < count; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            max = Math.max(scores[i], max);
        }

        // 점수/최대점수*100
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += (double) scores[i]/max*100;
        }

        System.out.println(sum/count);
    }
}
