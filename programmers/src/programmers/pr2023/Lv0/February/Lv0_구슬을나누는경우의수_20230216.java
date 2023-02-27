package programmers.pr2023.Lv0.February;

public class Lv0_구슬을나누는경우의수_20230216 {
    class Solution {
        public int solution(int balls, int share) {
            int answer = 0;
            answer = Math.toIntExact(numberOfCases(balls, share));
            return answer;
        }

        public Long numberOfCases(int balls, int share) {
            Long sum = 1L;

            for(int i = 1; i <= share; i++) {
                sum = (sum * balls) / i;
                balls--;
            }

            return sum;
        }
    }

}
