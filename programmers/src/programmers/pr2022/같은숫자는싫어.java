package programmers.pr2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		int[] answer;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if(arr[i-1] == arr[i]) {
				continue;
			} else {
				list.add(arr[i]);
			}
		}
		
		answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		
		System.out.println(Arrays.toString(answer));
	}

}
