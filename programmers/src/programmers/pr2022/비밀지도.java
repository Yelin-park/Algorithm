package programmers.pr2022;

import java.util.Arrays;

public class 비밀지도 {

	public static void main(String[] args) {
		// 어느하나라도 벽인 부분은 벽, 모두 공백인 부분은 공백
		// 벽은 1, 공백은 0
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		
		String[] sArr1 = new String[arr1.length];
		String[] sArr2 = new String[arr2.length];
		// Integer.toBinaryString(n); // 10진수를 2진수로 변환
		
		String[] answer = new String[sArr1.length];
		int max = 0;
				
		for (int i = 0; i < arr1.length; i++) {
			sArr1[i] = Integer.toBinaryString(arr1[i]).length() == n ? Integer.toBinaryString(arr1[i]) : String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr1[i])));
			sArr2[i] = Integer.toBinaryString(arr2[i]).length() == n ? Integer.toBinaryString(arr2[i]) : String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr2[i])));
			// max = sArr1[i].length() > sArr2[i].length() ? sArr1[i].length() : sArr2[i].length();
		}

		String temp = "";
		
		for (int i = 0; i < sArr1.length; i++) {
			for (int j = 0; j < sArr1[i].length(); j++) {
				
				if(sArr1[i].charAt(j) == sArr2[i].charAt(j) && sArr1[i].charAt(j) == '0') { // 모두 공백이라면 공백
					temp += " ";			
				} else { // 아니라면 다 벽
					temp += "#";
				}
				
				if(temp.length() == n) {
					answer[i] = temp;
					temp = "";
				} // if
			} // for j
		} // for i
		
		System.out.println(Arrays.toString(answer));
		
		
		
		Sol8 s = new Sol8();
		// String[] answer;
		answer = s.solution(n, arr1, arr2);
		System.out.println(Arrays.toString(answer));
		
		n = 6;
		int[] arr3 = {46, 33, 33, 22, 31, 50};
		int[] arr4 = {27, 56, 19, 14, 14, 10};
		answer = s.solution(n, arr3, arr4);
		System.out.println(Arrays.toString(answer));
		
	}

}

class Sol8 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] sArr1 = new String[arr1.length];
		String[] sArr2 = new String[arr2.length];
		String[] answer = new String[sArr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			sArr1[i] = Integer.toBinaryString(arr1[i]).length() == n ? Integer.toBinaryString(arr1[i]) : String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr1[i])));
			sArr2[i] = Integer.toBinaryString(arr2[i]).length() == n ? Integer.toBinaryString(arr2[i]) : String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr2[i])));
		}

		String temp = "";
		
		for (int i = 0; i < sArr1.length; i++) {
			for (int j = 0; j < sArr1[i].length(); j++) {
				if(sArr1[i].charAt(j) == sArr2[i].charAt(j) && sArr1[i].charAt(j) == '0') { // 모두 공백이라면 공백
					temp += " ";			
				} else { // 아니라면 다 벽
					temp += "#";
				}
				
				if(temp.length() == n) {
					answer[i] = temp;
					temp = "";
				} // if
			} // for j
		} // for i

        return answer;
    }
}
