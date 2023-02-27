package programmers.pr2023.Lv0.January;

public class Lv0_문자반복출력하기_20230130 {
    class Solution {
        public String solution(String my_string, int n) {
            String answer = "";
            for(int i = 0; i < my_string.length(); i++) {
                for(int j = 0; j < n; j++) {
                    answer += my_string.charAt(i);
                }
            }
            return answer;
        }
    }
}
