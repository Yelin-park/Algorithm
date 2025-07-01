package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N찍기_2741_250701 {
    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
