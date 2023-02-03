package programmers;

public class 가위바위보_20230203 {
    class Solution {
        public String solution(String rsp) {
            String answer = "";
            for(int i = 0; i < rsp.length(); i++) {
                if((rsp.charAt(i)+"").equals("2")) { // 가위
                    answer += "0";
                } else if((rsp.charAt(i)+"").equals("0")) { // 바위
                    answer += "5";
                } else if((rsp.charAt(i)+"").equals("5")) { // 보
                    answer += "2";
                }
            }
            return answer;
        }
    }
}
