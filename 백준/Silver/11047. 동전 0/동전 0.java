import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            int m = list.get(i);
            if (K >= m) {
                int n = K / m;
                int k = m * n;
                K -= k;
                count += n;
            }
        }

        System.out.println(count);
    }
}