import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr = s.toCharArray();
        int prev = arr[0];
        int zero = prev == '0' ? 1 : 0;
        int one = prev == '1' ? 1 : 0;
        for (int i = 1; i < arr.length; i++) {
            if (prev != '1' && arr[i] == '1') {
                one++;
            } else if (prev != '0' && arr[i] == '0') {
                zero++;
            }
            prev = arr[i];
        }

        int n;
        if (s.contains("0") && s.contains("1")) {
            n = Math.min(zero, one);
        } else {
            n = !s.contains("0") ? zero : one;
        }

        br.close();
        System.out.println(n);
    }
}