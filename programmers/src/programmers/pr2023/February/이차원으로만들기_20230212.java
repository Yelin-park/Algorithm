package programmers.pr2023.February;

public class 이차원으로만들기_20230212 {
    class Solution {
        public int[][] solution(int[] num_list, int n) {
            int[][] answer = new int[num_list.length/n][n];
            int no = 0;
            for(int i = 0; i < answer.length; i++){
                for(int j = 0; j < answer[i].length; j++){
                    answer[i][j] = num_list[no++];
                }
            }
            return answer;
        }
    }
}
