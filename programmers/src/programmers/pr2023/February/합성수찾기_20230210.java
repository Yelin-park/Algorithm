package programmers.pr2023.February;

public class 합성수찾기_20230210 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            int temp = 0;

            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= i; j++){
                    if(i % j == 0) temp ++;
                }
                if(temp >= 3) answer++;
                temp = 0;
            }

            return answer;
        }
    }
}
