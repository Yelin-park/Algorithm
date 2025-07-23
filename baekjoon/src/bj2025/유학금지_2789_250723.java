package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 유학금지_2789_250723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = {"C", "A", "M", "B", "R", "I", "D", "G", "E"};

        for (String s : arr) {
            str = str.replaceAll(s, "");
        }

        System.out.println(str);
    }
}
