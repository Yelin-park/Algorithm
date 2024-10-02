package programmers.pr2024.Lv0;

public class Lv0_접미사인지확인하기_20241002 {
    public static void main(String[] args) {
        Solution s = new Solution();
        final String my_string = "banana";
        final String is_suffix = "ana";

        s.solution(my_string, is_suffix);
    }

    static class Solution {
        public int solution(String my_string, String is_suffix) {
            int answer = 0;
            if (my_string.endsWith(is_suffix)) answer = 1;
            return answer;
        }
    }
}
