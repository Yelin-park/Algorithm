package programmers.pr2023.Lv0.February;

public class Lv0_문자열안에문자열_20230201 {
    class Solution {
        public int solution(String str1, String str2) {
            int answer = 0;
            int temp;

            temp = str1.indexOf(str2);

            if(temp == -1) {
                answer = 2;
            } else {
                answer = 1;
            }

            return answer;
        }
    }
}
