package programmers.pr2023.Lv0.February;

public class Lv0_암호해독_20230203 {
    class Solution {
        public String solution(String cipher, int code) {
            String answer = "";

            for(int i = 0; i < cipher.length()+1; i++){
                if(i != 0 && i % code == 0) {
                    answer += cipher.charAt(i-1);
                }
            }

            return answer;
        }
    }
}
