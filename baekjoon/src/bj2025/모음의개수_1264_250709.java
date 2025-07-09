package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 모음의개수_1264_250709 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"a", "e", "i", "o", "u"};
        StringBuilder sb = new StringBuilder();
        String str = "";
        while (true) {
            str = br.readLine();
            if (str.equals("#")) break;
            int count = 0;
            for (String s : str.split("")) {
                if (Arrays.asList(arr).contains(s.toLowerCase())) count++;
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb.deleteCharAt(sb.length()-1));
    }
}
