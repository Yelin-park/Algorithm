package programmers.pr2022;

public class 수박수박수 {

	public static void main(String[] args) {
		/*
		길이가 n이고,
		"수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수,
		solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

		제한 조건
		n은 길이 10,000이하인 자연수입니다.
		입출력 예
		n	return
		3	"수박수"
		4	"수박수박"
		*/
		Solution2 s = new Solution2();
		System.out.println(s.solution(5));

	}

}
class Solution2 {
	
    public String solution(int n) {
    	String answer ="";
    	StringBuffer sb = new StringBuffer();
    	if(0 < n && n <= 10000) {
    		for(int i = 0; i <= n/2; i++) {
    			sb.append("수박");
    		}
    		if(n % 2 == 1) sb.append("수");
    	}
    	answer = sb.toString();
    	return answer;
    	
    }
}