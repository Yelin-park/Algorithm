package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {

	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		
		Sol11 s = new Sol11();
		int[] answer = s.solution(progresses, speeds);
		
		System.out.println(Arrays.toString(answer));
	} // main

} // class

class Sol11 {
    public int[] solution(int[] progresses, int[] speeds) {
               
        Queue<Integer> q = new LinkedList<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < progresses.length; i++) {
			int date = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]); // 남은 개발일수 소수점 올린 후 int로 변환

			// 큐가 비어있지않고 맨 처음에 보관한 값이 남은 개발일수보다 작으면
			if(!q.isEmpty() && q.peek() < date) {
				// 리스트에 큐 사이즈를 추가(즉, 배포한 기능 수)
				list.add(q.size());
				q.clear(); // q를 비우기
			}

			q.offer(date); // 큐에 남은 개발일수 추가
			
		} // for i
        
        list.add(q.size()); // 리스트에 큐 사이즈를 추가(즉, 배포한 기능 수)
        
        int[] answer = new int[list.size()];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		} // for i
        
        return answer;
    }
}
