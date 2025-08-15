import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 수강한 과목
        int M = Integer.parseInt(st.nextToken()); // 요구 과목
        int K = Integer.parseInt(st.nextToken()); // 공개한 과목
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            int value = Integer.parseInt(st.nextToken());
            map.put(key, value);
        }

        int min = 0;
        int max = 0;
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            int score = map.get(key);
            min += score;
            max += score;
            map.remove(key);
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int start = 0;
        int end = list.size() - 1;
        for (int i = 0; i < M - K; i++) {
            min += list.get(start++);
            max += list.get(end--);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}