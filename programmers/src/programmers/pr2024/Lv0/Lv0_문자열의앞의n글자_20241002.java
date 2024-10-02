package programmers.pr2024.Lv0;

public class Lv0_문자열의앞의n글자_20241002 {
    public static void main(String[] args) {
        final String my_string = "ProgrammerS123";
        final int n = 11;

        Solution solution = new Solution();
        String answer = solution.solution(my_string, n);
        System.out.println("answer = " + answer);
    }

    static class Solution {
        public String solution(String my_string, int n) {
            return my_string.substring(0, n);
        }
    }

}
