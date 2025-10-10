import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 스위치 개수
        int[] sw = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            sw[i] = Integer.parseInt(st.nextToken());
        }

        int studentCnt = Integer.parseInt(br.readLine());
        for (int s = 0; s < studentCnt; s++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            // 남학생 : 배수에 해당하는 값을 바꾸기
            if (gender == 1) {
                for (int i = k; i <= N; i += k) {
                    sw[i] ^= 1;
                }
            } else {
                // 여학생 : 가지고 있는 값 중심으로 좌우 대칭, 최대 구간(개수는 홀수)
                int left = k, right = k;
                while (left - 1 >= 1 && right + 1 <= N 
                       && sw[left - 1] == sw[right + 1]) {
                    left--;
                    right++;
                }
                for (int i = left; i <= right; i++) {
                    sw[i] ^= 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(sw[i]).append(' ');
            if (i % 20 == 0) sb.append("\n");
        }

        System.out.println(sb);
    }
}