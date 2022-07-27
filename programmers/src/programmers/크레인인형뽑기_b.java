package programmers;

import java.util.ArrayList;

public class 크레인인형뽑기_b {

	public static void main(String[] args) {
		int[][] board = {
							{0,0,0,0,0},
							{0,0,1,0,3},
							{0,2,5,0,1},
							{4,2,4,4,2},
							{3,5,1,3,1}
						};
		
		int[] moves = {1,5,3,5,1,2,1,4}; // 열
		
		Crain cr = new Crain();
		int answer = cr.solution(board, moves);
		System.out.println(answer);
		

	} // main

} // class

class B {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> al = new ArrayList();
        al.add(-1);
        // 인형을 꺼내는 작업
        int n;
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if((n = board[j][moves[i]-1])!= 0){
                    // 뽑은 자리는 비어있음
                    board[j][moves[i]-1]=0;
                    if (al.get(al.size()-1) == n) {
                        al.remove(al.size()-1);
                        answer += 2;
                    } else {
                        al.add(n);
                    }
                    break;
                }
            }
        }
        return answer;

    } // solution
    
} // class