package programmers.pr2023.Lv1.March;

public class Lv1_푸드파이터대회_20230311 {
    class Solution {
        public String solution(int[] food) {
            String answer = "";
            // 물은 0(중앙) 같은 음식, 같은 칼로리로 왼 -> 오 | 오 -> 왼 배열 즉, 짝수가 되어야함
            for(int i = 1; i < food.length; i++){
                if(food[i] / 2 > 0) {
                    int cnt = 0;
                    while(cnt < food[i] / 2) {
                        answer += String.valueOf(i);
                        cnt++;
                    }
                }
            }

            answer += "0";

            for(int j = answer.length()-2; j >= 0; j--) {
                answer += answer.charAt(j);
            }

            return answer;
        }
    }
}
