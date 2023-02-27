package programmers.pr2023.Lv0.February;

public class Lv0_진료순서정하기_20230205 {
    class Solution {
        public int[] solution(int[] emergency) {
            int[] answer = new int[emergency.length];

            for(int i = 0; i < answer.length; i++){
                answer[i]++;
            }

            for(int i = 0; i < emergency.length; i++){
                for(int j = i+1; j < emergency.length; j++){
                    if(emergency[i] > emergency[j]){
                        answer[j]++;
                    } else if(emergency[i] < emergency[j]){
                        answer[i]++;
                    }
                }
            }
            return answer;
        }
    }
}
