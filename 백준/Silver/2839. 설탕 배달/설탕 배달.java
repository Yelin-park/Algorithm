import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int three = 0;
        while (N >= 0) {
            if (N % 5 == 0) {
                System.out.println((N / 5) + three);
                return;
            }
            N -= 3;
            three++;
        }
        System.out.println(-1);
    }
}