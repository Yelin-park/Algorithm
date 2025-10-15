import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[] choice;
    static boolean[] used;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        used = new boolean[N + 1];
        choice = new int[M];

        dfs(0);
        System.out.println(sb);
    }

    static void dfs(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(choice[i]).append(i + 1 == M ? "\n" : " ");
            }
            return;
        }

        for (int n = 1; n <= N; n++) {
            if (used[n]) continue;
            used[n] = true;
            choice[depth] = n;
            dfs(depth + 1);
            used[n] = false;
        }
    }
}
