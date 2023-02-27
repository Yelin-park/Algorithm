package programmers.pr2023.Lv0.January;

public class Lv0_짝수홀수개수_20230127 {
    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[2];
            for(int i = 0; i < num_list.length; i++) {
                if(num_list[i] % 2 == 0 ) {
                    answer[0] += 1;
                } else {
                    answer[1] += 1;
                }
            }
            return answer;
        }
    }
}
