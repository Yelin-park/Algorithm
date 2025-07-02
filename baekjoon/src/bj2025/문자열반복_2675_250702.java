package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열반복_2675_250702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        // v1
        /*for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            char[] arr = st.nextToken().toCharArray();
            StringBuilder sb = new StringBuilder();
            for(char c : arr) {
                for(int j = 0; j < R; j++) {
                    sb.append(c);
                }
            }
            answer.append(sb).append('\n');
            sb.delete(0, sb.length());
        }
        System.out.println(answer);*/

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            for (int j = 0; j < S.length(); j++) {
                for(int k = 0; k < R; k++) {
                    answer.append(S.charAt(j));
                }
            }
            answer.append('\n');;
        }
        System.out.println(answer);
    }
}
