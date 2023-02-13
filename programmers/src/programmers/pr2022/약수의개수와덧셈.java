package programmers.pr2022;

public class 약수의개수와덧셈 {

	public static void main(String[] args) {
		// 약수의 개수가 짝수인 수는 +
		// 약수의 개수가 홀수인 수는 -
		// 약수 : 나머지가 0이 되게 하는 수
		
		int left = 24;
		int right = 27;
		
		Sol5 s = new Sol5();
		int result = s.solution(left, right);
		System.out.println(result);
		
	} // main

} // class

class Sol5 {
    public int solution(int left, int right) {
        int answer = 0;
		int cnt = 0;
		
		for (int i = left; i <= right; i++) {
			for (int j = 1; j <= i; j++) {
				cnt += i % j == 0 ? 1 : 0; // 나머지가 0일 때만 갯수 증가
			}
			answer += cnt % 2 == 0 ? i : -i; // 갯수가 짝수이면 +, 홀수이면 -
			cnt = 0;
		}
		
        return answer;
    }
}
