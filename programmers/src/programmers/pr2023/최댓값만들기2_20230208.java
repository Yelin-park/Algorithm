package programmers.pr2023;

public class 최댓값만들기2_20230208 {
    class Solution {
        public int solution(int[] numbers) {
            int answer = 0;
            int max = numbers[0] * numbers[1]; // 음수끼리의 더 큰 값을 고려하여 numbers 배열에 있는 값으로 max 값을 할당

            for(int i = 0; i < numbers.length; i++){
                for(int j = i+1; j < numbers.length; j++){
                    max = max > numbers[i] * numbers[j] ? max : numbers[i] * numbers[j];
                }
            }

            return answer = max;
        }
    }
}
