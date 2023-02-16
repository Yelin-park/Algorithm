package programmers.pr2023.February;

public class 제곱수판별하기_20230201 {
    class Solution {
        public int solution(int n) {
            double temp = Math.sqrt(n);
            /* if (n % Math.sqrt(n) == 0) {
                이렇게도 조건식을 세울 수 있음
             */
            if(temp * 10 % 10 != 0) {
                return 2;
            } else {
                return 1;
            }

        }
    }
}
