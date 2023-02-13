package programmers.pr2022;

public class 두정수사이의합 {

	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		Sol13 s = new Sol13();
		System.out.println(s.solution(a, b));
				

	} // main

} // class

class Sol13 {
    public long solution(int a, int b) {
        long answer;
        
        int max = a > b ? a : b;
        int min = a > b ? b : a;
        
        int cnt = max - min;
        
        answer = max;
        
        if( cnt != 0) {
        	while(!(max == min)) {
        		max -= 1;
            	answer += max;
            }
        }
        
        return answer;
    }
}
