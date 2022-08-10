package programmers;

import java.util.Arrays;

public class 최대공약수와최소공배수 {

	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		
		Sol14 s = new Sol14();
		int[] result = s.solution(n, m);
		System.out.println(Arrays.toString(result));
	} // main

} // class

class Sol14 {
    public int[] solution(int n, int m) {

        int a = Math.max(n, m);
        int b = Math.min(n, m);
        
        while(b != 0) {
        	int r = a % b;
        	a = b;
        	b = r;
        }
        
        int[] answer = {a, n * m / a};
        
        return answer;
    }
}
