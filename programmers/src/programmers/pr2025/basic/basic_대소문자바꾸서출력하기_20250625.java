package programmers.pr2025.basic;

import java.util.Scanner;

public class basic_대소문자바꾸서출력하기_20250625 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                answer.append(String.valueOf(c).toLowerCase());
            } else {
                answer.append(String.valueOf(c).toUpperCase());
            }
        }

        System.out.println(answer);
    }
}


