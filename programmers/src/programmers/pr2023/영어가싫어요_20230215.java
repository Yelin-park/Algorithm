package programmers.pr2023;

public class 영어가싫어요_20230215 {
    class Solution {
        public long solution(String numbers) {
            long answer = 0;
            String[] strNumbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            for(int i = 0; i < strNumbers.length; i++){
                numbers = numbers.replaceAll(strNumbers[i], String.valueOf(i));
            }

            answer = Long.parseLong(numbers);

            return answer;
        }
    }
}
