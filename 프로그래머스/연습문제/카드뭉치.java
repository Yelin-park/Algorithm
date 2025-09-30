package 프로그래머스.연습문제;

public class 카드뭉치 {
    class Solution {
        public int solution(int[] ingredient) {
            int answer = 0;
            int[] burger = new int[ingredient.length];
            int top = 0;
            for (int i : ingredient) {
                burger[top++] = i;

                if (top >= 4
                    && burger[top - 4] == 1
                    && burger[top - 3] == 2
                    && burger[top - 2] == 3
                    && burger[top - 1] == 1) {
                    top -= 4;
                    answer++;
                }
            }

            return answer;
        }
    }
}
