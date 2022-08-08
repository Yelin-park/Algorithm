package programmers;

import java.util.Date;

public class 이천십육년 {

	public static void main(String[] args) {
		int a = 5, b = 24;
		
		Sol12 s = new Sol12();
		System.out.println(s.solution(a, b));
		
		

	} // main

} // class

class Sol12 {
    public String solution(int a, int b) {
        String answer = "";
        
        String[] weeks = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        
        int year = 2016 - 1900;
        int month = a-1;
        int day = b;
        
        Date dt = new Date(year, month, day);
        
        answer = weeks[dt.getDay()];
        
        return answer;
    }
}