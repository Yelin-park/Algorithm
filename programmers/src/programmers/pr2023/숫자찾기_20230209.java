package programmers.pr2023;

public class 숫자찾기_20230209 {
    class Solution {
        public int solution(int num, int k) {
            int answer = 0;
            String strNum = String.valueOf(num);

            if(strNum.indexOf(String.valueOf(k)) >= 0) {
                return answer = strNum.indexOf(String.valueOf(k)) + 1;
            } else {
                return -1;
            }

        }
    }
}
