package programmers.pr2023.Lv0.February;

public class Lv0_삼육구게임_20230209 {
    class Solution {
        public int solution(int order) {
            int answer = 0;

            char[] orderArr = String.valueOf(order).toCharArray();

            for(int i = 0; i < orderArr.length; i++) {
                if(orderArr[i] != '0' && orderArr[i] % 3 == 0) answer++;
            }

            return answer;
        }
    }
}
