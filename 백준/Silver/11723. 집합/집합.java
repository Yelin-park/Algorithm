import java.io.*;
import java.util.*;

public class Main {
    static HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            if (line.equals("all")) {
                set.clear();
                for (int v = 1; v <= 20; v++) set.add(v);
                continue;
            }
            if (line.equals("empty")) {
                set.clear();
                continue;
            }

            StringTokenizer st = new StringTokenizer(line);
            String cmd = st.nextToken();
            int x = Integer.parseInt(st.nextToken());

            switch (cmd) {
                case "add":
                    set.add(x);
                    break;
                case "remove":
                    set.remove(x);
                    break;
                case "check":
                    out.append(set.contains(x) ? 1 : 0).append('\n');
                    break;
                case "toggle":
                    if (set.contains(x)) set.remove(x);
                    else set.add(x);
                    break;
            }
        }
        System.out.print(out);
    }
}
