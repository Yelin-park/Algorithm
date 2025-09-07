import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] rank = new int[N];
        int[][] sizeArr = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sizeArr[i][0] = Integer.parseInt(st.nextToken());
            sizeArr[i][1] = Integer.parseInt(st.nextToken());
            rank[i] = 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (sizeArr[i][0] > sizeArr[j][0] && sizeArr[i][1] > sizeArr[j][1]) {
                    rank[j] += 1;
                } else if (sizeArr[i][0] < sizeArr[j][0] && sizeArr[i][1] < sizeArr[j][1]) {
                    rank[i] += 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int n : rank) {
            sb.append(n).append(" ");
        }
        System.out.println(sb);
    }
}