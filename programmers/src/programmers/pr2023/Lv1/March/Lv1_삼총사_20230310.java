package programmers.pr2023.Lv1.March;

public class Lv1_삼총사_20230310 {
    class Solution {
        public int solution(int[] number) {
            int answer = 0;

            for (int i = 0; i < number.length; i++) {
                int sum = 0;
                for (int j = i+1; j < number.length; j++) {
                    for (int k = j+1; k < number.length; k++) {
                        sum = number[i] + number[j] + number[k];
                        if(sum == 0) answer++;
                    }
                }
            }

            return answer;
        }
    }
}
