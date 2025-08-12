import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> xmap = new HashMap<>();
        HashMap<Integer, Integer> ymap = new HashMap<>();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            xmap.put(x, xmap.getOrDefault(x, 0) + 1);
            ymap.put(y, ymap.getOrDefault(y, 0) + 1);
        }

        int line = 0;
        for (int c : xmap.values()) if (c >= 2) line++;
        for (int c : ymap.values()) if (c >= 2) line++;

        System.out.println(line);
    }
}