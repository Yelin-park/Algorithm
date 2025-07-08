package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팰린드롬수_1259_250708 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";
        while (true) {
            str = br.readLine();
            if (str.equals("0")) break;
            boolean flag = false;
            char[] arr = str.toCharArray();
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] != arr[arr.length - 1 - i]) {
                    flag = true;
                    break;
                }
            }

            if (flag) sb.append("no\n");
            else sb.append("yes\n");
        }

        System.out.println(sb);
    }
}
