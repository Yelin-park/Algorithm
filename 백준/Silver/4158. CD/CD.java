import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String s = br.readLine();
            if (s.equals("0 0")) break;
            StringTokenizer st = new StringTokenizer(s);

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            HashMap<Long, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                long key = Long.parseLong(br.readLine());
                map.put(key, 1);
            }

            for (int i = 0; i < M; i++) {
                long key = Long.parseLong(br.readLine());
                map.put(key, map.getOrDefault(key, 0) + 1);
            }

            int count = 0;
            for (int num : map.values()) {
                if (num == 2) count++;
            }
            sb.append(count).append("\n");
        }
        
        System.out.println(sb);
    }
}