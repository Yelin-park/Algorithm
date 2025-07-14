package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 일곱난쟁이_2309_250714 {
    static int[] arr = new int[9];
    static int[] result = new int[7];
    static boolean flag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        combination(0, 0); // 조합 + 탐색을 위한 재귀
    }

    public static void combination(int start, int depth) {
        if (flag) return;

        if (depth == 7) { // 7명을 다 골랐을 때 합이 100인지 확인하기
            int sum = 0;
            for (int i : result) {
                sum += i;
            }

            if (sum == 100) {
                Arrays.sort(result);
                for (int n : result) {
                    System.out.println(n);
                }
                flag = true;
            }
            return;
        }

        for (int i = start; i < 9; i++) { // 현재 인덱스부터 반복
            result[depth] = arr[i]; // 현재 키 결과 배열에 저장
            combination(i + 1, depth + 1); // 다음 사람 선택(재귀 호출)
        }
    }
}
