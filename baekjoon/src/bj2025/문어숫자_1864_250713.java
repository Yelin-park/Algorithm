package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class 문어숫자_1864_250713 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Character[] arr = {'-', '\\', '(', '@', '?', '>', '&', '%', '/'};
        List<Character> list = Arrays.asList(arr);
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str.equals("#")) break;
            int sum = 0;
            int pow = str.length() - 1;
            for (int i = 0; i < str.length() - 1; i++) {
                int idx = list.indexOf(str.charAt(i));
                if (idx == list.size() - 1) idx = -1;
                int result = (int) (idx * Math.pow(8, pow));
                sum += result;
                pow--;
            }

            int last = list.indexOf(str.charAt(str.length() - 1));
            sum += last == list.size() - 1 ? -1 : last;
            sb.append(sum).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
