package programmers;

public class 짝수는싫어요_20230127 {
    class Solution {

        public int[] solution(int n) {

            int[] answer = n % 2 == 0 ? new int[n/2] : new int[n/2 + 1];
            int size = 0;

            for(int i = 1; i <= n; i++) {
                if(i % 2 != 0 && size < answer.length) {
                    answer[size++] = i;
                }

            }

            return answer;
        }
    }
}
