import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] distance = new int[N-1];
        int[] price = new int[N];
        for (int i = 0; i < N-1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        int total = distance[0] * price[0];
        int minPrice = price[0];
        for (int i = 1; i < N-1; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            }
            total += distance[i] * minPrice;
        }
        System.out.println(total);       
    }
}