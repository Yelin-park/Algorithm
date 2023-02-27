package programmers.pr2023.Lv0.January;

public class Lv0_머쓱이보다키큰사람_20230129 {

    class Solution {
        public int solution(int[] array, int height) {
            int answer = 0;
            for(int i = 0; i < array.length; i++) {
                if(array[i] > height) {
                    answer++;
                }
            }
            return answer;
        }
    }

}
