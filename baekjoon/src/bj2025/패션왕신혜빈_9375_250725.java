package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 패션왕신혜빈_9375_250725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken(); // 의상 이름 무시
                String type = st.nextToken(); // 의상 종류
                // 의상 종류에 따라 의상이 몇개인지 Map에 담기
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int result = 1;
            for (int count : map.values()) {
                // 해당 종류의 옷을 안입는 경우도 포함하여 계산
                result *= (count + 1);
            }

            // 최종적으로 모두 안입는 경우의 수를 빼기
            sb.append(result - 1).append("\n");
        }

        System.out.println(sb);
    }
}
