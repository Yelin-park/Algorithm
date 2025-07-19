package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 도비의영어공부_2386_250719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            int count = 0;
            String str = br.readLine();
            if (str.equals("#")) break;
            str = str.toLowerCase();
            char first = str.charAt(0);
            for (int i = 1; i < str.length(); i++) {
                if (first == str.charAt(i)) count++;
            }
            sb.append(first).append(" ").append(count).append("\n");
        }

        System.out.println(sb);
    }
}
