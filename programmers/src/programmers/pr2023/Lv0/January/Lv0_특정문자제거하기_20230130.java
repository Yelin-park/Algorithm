package programmers.pr2023.Lv0.January;

public class Lv0_특정문자제거하기_20230130 {
    class Solution {
        public String solution(String my_string, String letter) {
            String answer = my_string.replaceAll(letter, "");
            return answer;
        }
    }
}
