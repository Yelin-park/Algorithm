package programmers.pr2023.Lv1.March;

public class Lv1_소수찾기_20230312 {
    class Solution {
        public int solution(int n) {
            int answer = 0;

            for(int i = 2; i <= n; i++) {
                int temp = 0;
                for(int j = 2; j <= Math.sqrt(i); j++) {
                    if(i % j == 0) {
                        temp++;
                        break;
                    }
                }
                if(temp == 0) answer++;
            }

            return answer;
        }
    }
}
