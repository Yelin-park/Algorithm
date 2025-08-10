import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int start = 1;
        int end = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > end) end = arr[i];
        }

        int maxLength = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            int count = 0;
            for (int n : arr) {
                count += (n / mid);
                if (count >= M) break;
            }

            if (count >= M) {
                maxLength = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(maxLength);
    }
}