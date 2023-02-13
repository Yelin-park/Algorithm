package programmers.pr2022;

import java.util.LinkedList;

public class 크레인인형뽑기 {

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

class Crain {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
		LinkedList<String> dol = new LinkedList<String>();
		
		 roop : for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[j][moves[i]-1] == 0) continue; // 뽑은 인형이 0이라면 다음 코딩 진행
				if(board[j][moves[i]-1] > 0) { // 뽑은 인형이 0보다 크다면
					dol.add(board[j][moves[i]-1] + ""); // LinkedList에 넣고
					board[j][moves[i]-1] = 0; // 그 자리는 0으로 대체하겠다.
					continue roop; // 그리고 for문을 다시 돌아라
				} // if
			} // for j
		} // for i
		 
		for (int i = 1; i < dol.size(); i++) { // LinkedList 크기만큼 for문 돌겠다.
				String a = dol.get(i-1);
				String b = dol.get(i);
				if(a.equals(b)) { // 앞 뒤 값이 똑같다면
					answer += 2; // 2를 증가하고
					dol.remove(a); // 해당하는 값들 삭제
					dol.remove(b);
					i = 1; // 인형 터트렸다면 처음부터 다시 돌기 위해 초기화
				} // if
		} // for i
		 
        return answer;
    } // solution
    
} // class