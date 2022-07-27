package programmers;

import java.util.ArrayList;
import java.util.Iterator;

public class 소수찾기 {

	public static void main(String[] args) {
		int n = 10;
		int answer;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 소수 : 1과 자기 자신으로만 나누어지는 수
		// 1은 소수가 아님
		// 에라토스테네스의 체 방법
		// 1. 찾고자 하는 범위의 자연수 나열
		// 2. 1 지우기
		// 3. 2부터 시작하여 2의 배수를 지우기
		// 4. 다음 소수의 배수를 모두 지움(3, 5, 7..)
		
		// 9가 3의 배수이면 3은 9의 약수이다.
		
		// 불린 배열을 만들어서 소수이면 true로 변경하기
		boolean[] tfList = new boolean[n+1];
		tfList[0] = false;
		tfList[1] = false;
		
		for (int i = 2; i * i <= n; i++) {
			if(tfList[i]) { // i가 true라면
				for (int j = i*i; j <= n; j+=i) { // i의 배수인 값(j)는 false로 변경
					tfList[j] = false;
				} // for j
			} // if
		} // for i
		
		for (int i = 1; i <= n; i++) {
			if(tfList[i]) list.add(i);
		}		
		
		System.out.println(list);
		
		
		
		


	} // main

} // class

class Sol_4 {
    public int solution(int n) {
        int answer = 0;
        return answer;
    }
}
