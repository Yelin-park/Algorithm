package programmers;

public class 양꼬치_20230127 {
    class Solution {
        public int solution(int n, int k) {
            int answer = 0;

            // 양꼬치 1인분 12,000원
            // 음료수 1개 2,000원

            if(n / 10 > 0) {
                answer = (n * 12000) + ((k - n / 10) * 2000);
            } else {
                answer = n * 12000 + k * 2000;
            }

            return answer;
        }
    }
}
