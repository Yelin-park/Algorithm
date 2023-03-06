package programmers.pr2023.Lv0.March;

public class Lv0_안전지대_20230306 {
    public static void main(String[] args) {
        /* int[][] board = {{0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0}}; */
        // int[][] board = {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};
        int[][] board = {{0,0,0,0,0},
                        {0,0,0,0,0},
                        {0,0,0,0,0},
                        {0,0,1,1,0},
                        {0,0,0,0,0}};
        Solution s = new Solution();
        System.out.println(s.solution(board));
    }
    static class Solution {
        public int solution(int[][] board) {
            int answer = 0;

            int[][] temp = new int[board.length][board[0].length];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    temp[i][j] = board[i][j];
                }
            }

            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board[0].length; j++){
                    if(board[i][j] == 1) {
                        temp[i][j] = 1;
                        if(i-1 >= 0) {
                            temp[i-1][j] = 1;
                        }

                        if(i+1 < board.length){
                            temp[i+1][j] = 1;
                        }

                        if(i+1 < board.length) {
                            if (j + 1 < board[0].length) {
                                temp[i + 1][j + 1] = 1;
                            }
                            if (j - 1 >= 0) {
                                temp[i + 1][j - 1] = 1;
                            }
                        }

                        if(j+1 < board[0].length) {
                            temp[i][j+1] = 1;
                        }

                        if(j-1 >= 0) {
                            temp[i][j-1] = 1;
                        }

                        if(i-1 >= 0) {
                            if(j+1 < board[0].length) {
                                temp[i-1][j+1] = 1;
                            }
                            if(j-1 >= 0) {
                                temp[i-1][j-1] = 1;
                            }
                        }

                    }
                }
            }

            for(int i = 0; i < temp.length; i++){
                for(int j = 0; j < temp[i].length; j++){
                    if(temp[i][j] == 0) answer++;
                }
            }

            return answer;
        }
    }
}
