import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = 0;
        if (count == 1) {
            int num = Integer.parseInt(st.nextToken());
            N = num * num;
        } else {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < count; i++) {
                int num = Integer.parseInt(st.nextToken());
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
            N = min * max;
        }

        System.out.println(N);
    }
}