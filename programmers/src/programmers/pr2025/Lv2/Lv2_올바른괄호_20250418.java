package programmers.pr2025.Lv2;

import java.util.*;

public class Lv2_올바른괄호_20250418 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "()()";
        String s2 = "(())()";
        String s3 = ")()(";
        String s4 = "";
        String s5 = "())((()))(()";

        boolean b = solution.solution(s);
        boolean b1 = solution.solution(s2);
        boolean b2 = solution.solution(s3);
        boolean b3 = solution.solution(s4);
        boolean b4 = solution.solution(s5);

        System.out.println("b = " + b);
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);
    }

    static class Solution {
        boolean solution(String s) {
            Queue queue = new LinkedList<>();
            char[] charArray = s.toCharArray();

            if (charArray.length == 0) return false;
            for (char str : charArray) {
                queue.offer(str);
            }

            int count = 0;
            boolean sw = false;
            while (!queue.isEmpty()) {
                char poll = (char) queue.poll();
                if (poll == '(') {
                    if (count < 0) return false;
                    count++;
                    sw = false;
                }

                if (poll == ')') {
                    count--;
                    if (count == 0) sw = true;
                    else sw = false;
                }
            }

            if (count == 0 && sw) return true;
            else return false;
        }
    }
}
