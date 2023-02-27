package programmers.pr2023.Lv1.February;

public class Lv1_없는숫자더하기_20230226 {
    class Solution {
        public int solution(int[] numbers) {
            int answer = 45;
            for(int i = 0; i < numbers.length; i++) {
                answer -= numbers[i];
            }
            return answer;
        }
    }
}
