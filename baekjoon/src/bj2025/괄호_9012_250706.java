package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호_9012_250706 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            char[] arr = str.toCharArray();
            Stack<Character> stack = new Stack<>();
            for (char c : arr) {
                if (c == '(') stack.push(c);
                else if (!stack.isEmpty()) stack.pop();
                else {
                    stack.push(c);
                    break;
                }
            }

            if (stack.isEmpty()) sb.append("YES\n");
            else sb.append("NO\n");
        }

        System.out.println(sb);
    }
}
