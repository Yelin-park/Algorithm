package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상수_2908_250703 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String s1 = st.nextToken();
        String s2 = st.nextToken();

        // reverse를 사용해도 될듯하다.
        // sb1.append(s1).reverse();

        for (int i = s1.length()-1; i >= 0; i--) {
            sb1.append(s1.charAt(i));
            sb2.append(s2.charAt(i));
        }

        int max = Math.max(Integer.parseInt(sb1.toString()), Integer.parseInt(sb2.toString()));

        System.out.println(max);
    }
}
