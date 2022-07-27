package programmers;

import java.util.Iterator;
import java.util.LinkedList;

public class 크레인인형뽑기_m {

	public static void main(String[] args) {
		int[][] board = {
							{0,0,0,0,0},
							{0,0,1,0,3},
							{0,2,5,0,1},
							{4,2,4,4,2},
							{3,5,1,3,1}
						};
		
		int[] moves = {1,5,3,5,1,2,1,4}; // 열
		
		LinkedList<String> dol = new LinkedList<String>();
		
		 roop : for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[j][moves[i]-1] == 0) {
					continue;
				}
				if(board[j][moves[i]-1] > 0) {
					dol.add(board[j][moves[i]-1] + "");
					board[j][moves[i]-1] = 0;
					continue roop;
				}
			} // for j
		} // for i
		
		 /*
		Iterator<String> ir = dol.iterator();
		while (ir.hasNext()) {
			String num = ir.next();
			System.out.print(num);
		}
		*/
		 
		int answer = 0;
		for (int i = 1; i < dol.size(); i++) {
			String a = dol.get(i-1);
			String b = dol.get(i);
			if(a.equals(b)) {
				answer += 2;
				dol.remove(a);
				dol.remove(b);
				i = 1;
			}
		}
		
		System.out.println("a = " + answer);

	} // main

} // class
