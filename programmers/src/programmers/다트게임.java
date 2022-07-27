package programmers;

public class 다트게임 {

	public static void main(String[] args) {
		/*
		 * 점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수1 , 점수2 , 점수3 )으로 계산. 점수마다 하나씩 존재
		 * 옵션 : 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스되어짐
		 * 스타상은 첫번째 기회에서도 나올 수 있고 이 경우엔 스타상의 점수만 2배
		 * 스타상의 효과는 다른 스타상의 효과와 중첩 (4배)
		 * 스타상의 효과는 아차상의 효과와 중첩 이 경우 아차상의 점수는 -2배
		 */

		// 입력형식 : "점수|보너스|[옵션]"으로 이루어진 문자열 3세트.
		// 옵션이 있으면 +가 아니라 *
		String dartResult = "1S2D*3T";
		// String dart = "1S*2T*3S";
		Sol6 sol = new Sol6();
		int result = sol.solution(dartResult);
		System.out.println(result);
		

	} // main

} // class

class Sol6 {
	public int solution(String dartResult) {
		int answer = 0;
		int gameScore[] = new int[3];
		int cur = 0, idx = 0;
		String num = "";
		for (int i = 0; i < dartResult.length(); i++) {
			char ch = dartResult.charAt(i);
			if (ch >= '0' && ch <= 9) { // 숫자라면
				num += String.valueOf(ch);
			} else if(ch == 'S' || ch == 'D' || ch == 'T') {
				cur = Integer.parseInt(num);
				switch (ch) {
				case 'S':
					cur = (int) Math.pow(cur, 1);
					break;
				case 'D':
					cur = (int) Math.pow(cur, 2);
					break;
				case 'T':
					cur = (int) Math.pow(cur, 3);
					break;
				}
				gameScore[idx++] = cur;
				num = "";
			} else {
				if(ch == '#') {
					gameScore[idx - 1] *= -1;
				} else { // * 옵션
					gameScore[idx - 1] *= 2;
					if(idx - 2 >= 0) {
						gameScore[idx - 2] *= 2;
					}
				}
			}
		}

		
		return answer;
	}
}