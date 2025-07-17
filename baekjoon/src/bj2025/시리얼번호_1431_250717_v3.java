package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 1. 시리얼 번호 길이가 짧은 거 먼저
// 2. 길이가 같으면 합이 작은 것(숫자만 더하기)
// 3. 사전순 비교(숫자가 알파벳보다 사전순으로 작다)
public class 시리얼번호_1431_250717_v3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Serial> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                if ('0' <= s.charAt(j) && s.charAt(j) <= '9') {
                    sum += s.charAt(j) - '0';
                }
            }
            list.add(new Serial(s.length(), sum, s));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (Serial s : list) {
            sb.append(s.value).append("\n");
        }

        System.out.println(sb);
    }

    public static class Serial implements Comparable<Serial> {
        int size;
        int sum;
        String value;

        public Serial(int size, int sum, String value) {
            this.size = size;
            this.sum = sum;
            this.value = value;
        }

        @Override
        public int compareTo(Serial s) {
            if (this.size == s.size) {
                if (this.sum == s.sum) {
                    return this.value.compareTo(s.value); // 사전 순 비교
                }
                return this.sum - s.sum; // 숫자의 합 비교
            }
            return this.size - s.size; // 길이 비교
        }
    }
}

