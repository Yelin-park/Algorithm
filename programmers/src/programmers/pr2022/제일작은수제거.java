package programmers.pr2022;

import java.util.Arrays;

public class 제일작은수제거 {

	public static void main(String[] args) {
		
		int[] arr = {5, 1, 2, 6, 8};
		// [5, 1, 2, 6, 8] -> [5, 2, 6, 8]
		
		Solution3 s3 = new Solution3();
		int[] answer = s3.solution(arr);
		System.out.println(Arrays.toString(answer));

	} // main

} // class

//정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수
//단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
//예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

// 제한 조건
// arr은 길이 1 이상인 배열입니다.
// 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

class Solution3 {
    public int[] solution(int[] arr) {
        if(arr.length > 1) {
            int[] answer = new int[arr.length-1];         
    		int min = arr[0];
    		
    		for (int i = 0; i < arr.length; i++) {
    			min = arr[i] < min ? arr[i] : min;
    		} // for i
    		// [5, 1, 2, 6, 8] -> [5, 2, 6, 8]
    		int n = 0;
    		for (int i = 0; i < arr.length; i++) {
    			if(min != arr[i]) {
    				answer[n++] = arr[i];
    			}     			
    		} // for i
    		
    		return answer;
	        
       } else {
    	   int[] answer = new int[1];
    	   answer[0] = -1;
    	   
    	   return answer;
       } // if-else

    } // solution
    
} // Solution3


