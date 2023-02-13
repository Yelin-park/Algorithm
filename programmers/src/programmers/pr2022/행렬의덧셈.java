package programmers.pr2022;

import java.util.Arrays;

public class 행렬의덧셈 {

	public static void main(String[] args) {
		S s = new S();
		
		int[][] arr1 = { {1,2}, {2,3} };
		int[][] arr2 = { {3,4}, {5,6} };
		
		int[][]answer = s.solution(arr1, arr2);
		
		for (int[] is : answer) {
			System.out.print(Arrays.toString(is));
		} // for-each
		
	} // main

} // class

class S {
	
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = new int[arr1.length][arr1[0].length];
        
        for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			} // for j
		} // for i
        
        return answer;
    }
     
}
