package programmers.pr2022;

import java.util.Arrays;

public class 체육복 {

	public static void main(String[] args) {
		/*
		전체 학생의 수는 2명 이상 30명 이하입니다.
		체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
		여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
		여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
		여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
		*/
		
		// 앞, 뒤로만 빌려줄 수 있음
		int n = 5; // 전체 학생 수
		int[] lost = {1, 2}; // 체육복을 도난당한 학생들 번호
		int[] reserve = {2, 3}; // 여벌의 체육복을 가진 학생들 번호
		int answer; // 체육 수업을 들을 수 있는 학생의 최댓값
		
		Sol4 s = new Sol4();
		answer = s.solution(n, lost, reserve);
		System.out.println(answer);
	
		
	} // main

} // class

class Sol4 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length; // 전체 학생 수 - 도난 당한 학생수 = 최소한 체육 수업 들을 수 있는 학생 수
        
        // 테스트 케이스에 정렬 안된 배열이 들어올 경우 실패가 떠서 배열 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
		// 도난 당한 학생과 여벌의 체육복을 가진 학생이 같은지 비교
		for (int i = 0; i < lost.length; i++) { // 도난당한 학생
			for (int j = 0; j < reserve.length; j++) { // 여벌의 체육복 가진 학생
				if(lost[i] == reserve[j]) { // 도난 당한 학생이 여벌의 체육복을 가진 학생이라면
					answer++; // 체육 수업 듣는 학생 증가
					lost[i] = -1; // 확인한 배열의 값은 -1 값으로 바꿈
					reserve[j] = -1;
				} // if
			} // for j
		} // for i
		
		// 도난 당한 학생에게 빌려줄 수 있는 상황
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]) { // 앞, 뒤 학생인지 체크
					answer++;
					reserve[j] = -1; // 체육복 빌려주고 -1 값으로 바꿈
					break;
				} // if
			} // for j
		} // for i
		
        return answer;
    }
    
}