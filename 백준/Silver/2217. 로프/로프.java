import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] rope = new int[N];
        for (int i = 0; i < N; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(rope);
        
        long answer = 0;
        for (int i = 0; i < N; i++) {
            int k = N - i;
            long w = 1L * rope[i] * k;
            if (w > answer) answer = w;
        }
        System.out.println(answer);
    }
}