package programmers.pr2023;

public class 옷가게할인받기_20230131 {

    class Solution {
        public int solution(int price) {
            int answer = price;

            if (price >= 500000) {
                answer = (int) (price * 0.8);
            } else if (price >= 300000) {
                answer = (int) (price * 0.9);
            } else if (price >= 100000) {
                answer = (int) (price * 0.95);
            }

            return answer;
        }
    }

}

