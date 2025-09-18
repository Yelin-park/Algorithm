import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        long max = 0;
        int num = 1;
        while (S >= num) {
            S -= num;
            num++;
            max++;
        }
        System.out.println(max);
        br.close();
    }
}