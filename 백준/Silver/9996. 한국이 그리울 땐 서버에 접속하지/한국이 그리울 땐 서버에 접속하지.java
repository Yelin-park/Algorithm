import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String pattern = br.readLine();
        String[] parts = pattern.split("\\*", -1);
        String prefix = parts[0];
        String suffix = parts[1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.length() < prefix.length() + suffix.length()) {
                sb.append("NE").append("\n");
                continue;
            }

            boolean flag = str.startsWith(prefix) && str.endsWith(suffix);
            sb.append(flag ? "DA\n" : "NE\n");
        }

        System.out.println(sb);
    }
}