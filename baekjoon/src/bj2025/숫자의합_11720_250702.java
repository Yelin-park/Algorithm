package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의합_11720_250702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] numList = br.readLine().split("");

        int sum = 0;
        for (String s : numList) {
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
    }
}
