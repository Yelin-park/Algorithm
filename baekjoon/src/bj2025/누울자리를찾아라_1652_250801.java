package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2칸 이상의 빈칸 존재 + 벽이나 짐에 닿아야 함(중간에 어정쩡하게 눕는 경우가 없음)
public class 누울자리를찾아라_1652_250801 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[][] room = new boolean[N][N];
        int x = 0; // 가로
        int y = 0; // 세로

        for (int i = 0; i < N; i++) {
            char[] charArray = br.readLine().toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                room[i][j] = charArray[j] == '.';
            }
        }

        // 가로 검사
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (room[i][j]) count++;
                if (!room[i][j] || j == N - 1) {
                    if (count >= 2) x++;
                    count = 0;
                }
            }
        }

        // 세로 검사
        for (int j = 0; j < N; j++) {
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (room[i][j]) count++;
                if (!room[i][j] || i == N - 1) {
                    if (count >= 2) {
                        y++;
                    }
                    count = 0;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(x).append(" ").append(y);
        System.out.println(sb);
    }
}
