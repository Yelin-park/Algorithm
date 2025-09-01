import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final int MOD = 1000000007;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        long[] dp = new long[N + 1];
        dp[0] = 1;
        for (int i = 1; i <= N; i++) {
            dp[i] = (dp[i] + dp[i - 1]) % MOD;
            if(i - M >= 0) {
                dp[i] = (dp[i] + dp[i - M]) % MOD;
            }
        }
        
        System.out.println(dp[N] % MOD);
    }
}