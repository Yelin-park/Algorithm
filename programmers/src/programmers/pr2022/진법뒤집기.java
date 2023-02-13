package programmers.pr2022;

import java.util.ArrayList;

public class 진법뒤집기 {

	public static void main(String[] args) {
		int result;
		Sol_3 s = new Sol_3();
		
		result = s.solution(45);
		
		System.out.println(result);
	} // main

} // class

class Sol_3 {
    public int solution(int n) {
        int answer = 0;
        
        // list에 add하면 맨 처음에 나온 나머지가 0번째에 들어가짐
        ArrayList<String> list = new ArrayList<String>();
        
		// 3으로 나눠서 0이 될 때 까지 반복
        while(n != 0) {
            list.add((n % 3) + ""); // 3으로 나눈 나머지를 list에 넣고
            n /= 3; // n은 3으로 나눠서 값을 다시 바꾸기
        }
        
        String sList = String.join("", list);
        answer = Integer.parseInt(sList, 3);
        
        return answer;
    }
} // Sol_3

