package programmers.pr2023.Lv0.January;

public class Lv0_피자나눠먹기2_20230131 {

    class Solution {
        public int solution(int n) {
            int answer = 0;
            int pizzaSlice = 6;

            while(true) {
                answer++;

                if(pizzaSlice * answer % n == 0) {
                    return answer;
                }
            }

        }
    }

}
