package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분해합_2231_250707 {
    public static void main(String[] args) throws IOException {
        // 버전1
        /*int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int conNum = 0;
        for (int i = 0; i <= N; i++) {
            if (cal(i) == N) {
                conNum = i;
                break;
            }
        }

        System.out.println(conNum);*/

        // 버전2(개선)
        // 자기 자신에 각 자리수를 더한 것이기 때문에, 최대 9 × 자리수 만큼만 이전부터 확인해도 충분
        // 예시로 N = 216이면, 자릿수는 3자리 → 최대 감소 가능 범위는 9 * 3 = 27, 따라서 start = 189부터 시작
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int N = Integer.parseInt(s);
        int result = 0;
        for (int i = N - (s.length() * 9); i < N; i++ ) {
            if (cal(i) == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

    public static int cal(int N) {
        int sum = N;
        while(N > 0) {
            sum += N % 10;
            N /= 10;
        }
        return sum;
    }
}
