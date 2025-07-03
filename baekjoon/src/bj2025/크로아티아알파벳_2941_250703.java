package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아알파벳_2941_250703 {
    public static void main(String[] args) throws IOException {
        final String[] ARR = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (String s : ARR) {
            str = str.replaceAll(s, "a");
        }

        System.out.println(str.length());
    }
}
