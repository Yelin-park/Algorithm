package programmers;

public class 팩토리얼_20230211 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            int temp = 1;
            int i = 2;

            // n보다 값이 커지면 반복문을 중단
            while(temp <= n){
                temp *= i++;
                answer++; // 팩토리얼 값을 구하기 위해 반복문을 돌 때 마다 1 증가
            }

            return answer;
        }
    }
}
