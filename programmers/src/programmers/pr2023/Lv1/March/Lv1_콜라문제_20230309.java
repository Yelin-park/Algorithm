package programmers.pr2023.Lv1.March;

public class Lv1_콜라문제_20230309 {
    class Solution {
        public int solution(int a, int b, int n) {
            int answer = 0;
            int temp = 0;

            while(true) {
                temp = (n / a) * b + (n % a);
                answer += (n / a * b);
                n = temp;
                if(n < a) return answer;
            }

        }
    }
}
