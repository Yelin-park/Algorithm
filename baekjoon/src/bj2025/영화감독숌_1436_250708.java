package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 영화감독숌_1436_250708 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 666 숫자가 들어간 수들 중에서..
        int num = 666;
        int count = 1;

        while (count != N) {
            num++;

            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }

        System.out.println(count);
    }
}
