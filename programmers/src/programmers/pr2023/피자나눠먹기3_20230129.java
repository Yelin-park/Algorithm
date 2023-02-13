package programmers.pr2023;

public class 피자나눠먹기3_20230129 {

    class Solution {
        public int solution(int slice, int n) {
            int answer = 0;
            do {
                n -= slice;
                answer++;
            } while(n > 0);
            return answer;
        }
    }

}
