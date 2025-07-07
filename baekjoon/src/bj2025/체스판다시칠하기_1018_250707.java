package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * // 8*8 체스판 구현, 색칠을 가장 적게하는 수를 구하기
 * // WBWBWBWB || BWBWBWBW
 * // BWBWBWBW || WBWBWBWB
 */
public class 체스판다시칠하기_1018_250707 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 보드 입력
        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minRepaint = Integer.MAX_VALUE;

        // N*M의 보드판을 (N-7) * (M-7) 개수의 체스판 만큼 검사해야함
        for (int i = 0; i < (N - 7); i++) {
            for (int j = 0; j < (M - 7); j++) {
                int r1 = countRepaint(board, i, j, 'W');
                int r2 = countRepaint(board, i, j, 'B');;
                minRepaint = Math.min(minRepaint, Math.min(r1, r2));
            }
        }

        System.out.println(minRepaint);
    }

    public static int countRepaint(char[][] board, int row, int col, char firstColor) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // 현재 칸이 흰색인지 검은색인지 확인(짝수와 홀수로 색깔 구분)
                char expected = ((i + j) % 2 == 0) ? firstColor : oppositeColor(firstColor);
                // 실제 색과 다르면 색칠 회수 증가
                if(board[row + i][col + j] != expected) count++;
            }
        }
        return count;
    }

    public static char oppositeColor(char color) {
        return color == 'W' ? 'B' : 'W';
    }
}
