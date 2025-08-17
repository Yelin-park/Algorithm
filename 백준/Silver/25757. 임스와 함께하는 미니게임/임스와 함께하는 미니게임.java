import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        HashSet<String> player = new HashSet<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            player.add(st.nextToken());
        }
        if (game.equals("Y")) {
            System.out.println(player.size() / 1);
        } else if (game.equals("F")) {
            System.out.println(player.size() / 2);
        } else if (game.equals("O")) {
            System.out.println(player.size() / 3);
        }
    }
}