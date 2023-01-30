package programmers;

public class 특정문자제거하기_20230130 {
    class Solution {
        public String solution(String my_string, String letter) {
            String answer = my_string.replaceAll(letter, "");
            return answer;
        }
    }
}
