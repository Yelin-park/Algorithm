package programmers.pr2023.January;

public class 아이스아메리카노_20230130 {

    class Solution {
        public int[] solution(int money) {
            int[] answer = new int[2];
            int iceAmericano = 5500;

            while(true) {
                if(money >= iceAmericano) {
                    money -= iceAmericano;
                    answer[0] += 1;
                } else {
                    answer[1] = money;
                    return answer;
                }
            } // while
        }

    }

}
