package programmers;

public class 피자나눠먹기_20230128 {

    class Solution {

        public int solution(int n) {
            int answer = 0;
            int pizza = 7;

            do {
                answer++;
                n -= pizza;
            } while(n > 0);

            return answer;
        }

    }

}
