import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int left = 0, right = 0;
        long sum = 0;

        while (true) {
            if (sum >= M) {
                if (sum == M) cnt++;
                sum -= arr[left++];
            } else { // sum < M
                if (right == N) break;
                sum += arr[right++];
            }
        }

        System.out.println(cnt);
    }
}