package programmers.pr2023.Lv1.February;

public class Lv1_문자열다루기기본_20230228 {
    class Solution {
        public boolean solution(String s) {
            boolean answer = false;
            if(s.length() == 4 || s.length() == 6) {
                s = s.replaceAll("[a-zA-Z]", "X");
                if(s.indexOf("X") > -1) {
                    return false;
                }
                return true;
            }
            return answer;
        }
    }
}
