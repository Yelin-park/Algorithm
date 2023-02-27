package programmers.pr2023.Lv0.January;

public class Lv0_중복된숫자개수_20230129 {

    class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;
            for(int i = 0; i < array.length; i++) {
                if(array[i] == n) {
                    answer++;
                }
            }
            return answer;
        }
    }

}
