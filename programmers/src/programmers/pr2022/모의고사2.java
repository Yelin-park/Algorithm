package programmers.pr2022;

import java.util.Arrays;

public class 모의고사2 {

	public static void main(String[] args) {
		/*
		int[] 수포자1 = {1,2,3,4,5};
		int[] 수포자2 = {2,1,2,3,2,4,2,5};
		int[] 수포자3 = {3,3,1,1,2,2,4,4,5,5};

		int[] answers = {1,2,3,4,5};
		int[] answer;
		int[] score = new int[3]; // 맞춘 점수

		for (int i = 0; i < answers.length; i++) {
			if(수포자1[i] == answers[i]) score[0]++;
			if(수포자2[i] == answers[i]) score[1]++;
			if(수포자3[i] == answers[i]) score[2]++;
		}
				
		int size = 0; // 정답 배열 크기 정하기
		for (int i = 0; i < score.length; i++) {
			if( score[i] != 0 ) size++;
		}
		
		answer = new int[size];
		
		for (int i = 0; i < score.length; i++) {
			if( score[i] != 0 ) answer[i] = i+1;
		}

		System.out.println(Arrays.toString(answer));
	*/
		
		
		Sol10 s = new Sol10();
		int[] answers = {1,2,3,4,5};
		int[] a = s.solution(answers);
		System.out.println(Arrays.toString(a));
		
		int[] answers2 = {1,3,2,4,2};
		int[] b = s.solution(answers2);
		System.out.println(Arrays.toString(b));
		
		int[] answers3 = {3, 3, 2, 1, 5}; // 3
		int[] c = s.solution(answers3);
		System.out.println(Arrays.toString(c));
		
		int[] answers4 = {5, 5, 4, 2, 3}; // 123
		int[] d = s.solution(answers4);
		System.out.println(Arrays.toString(d));
		
	}
}

class Sol10 {
	public int[] solution(int[] answers) {
		int[] 수포자1 = {1,2,3,4,5};
		int[] 수포자2 = {2,1,2,3,2,4,2,5};
		int[] 수포자3 = {3,3,1,1,2,2,4,4,5,5};

		int[] answer;
		int[] score = new int[3]; // 맞춘 점수

		for (int i = 0; i < answers.length; i++) {
			if(수포자1[i] == answers[i]) score[0]++;
			if(수포자2[i] == answers[i]) score[1]++;
			if(수포자3[i] == answers[i]) score[2]++;
		}
				
		int size = 0; // 정답 배열 크기 정하기
		int max = 0; // 제일 큰 값
		for (int i = 0; i < score.length; i++) {
			max = score[i] > max ? score[i] : max;
			if( score[i] != 0 ) size++;
		}
		
		answer = new int[size];
		
		for (int i = 0; i < score.length; i++) {
			if( score[i] != 0 ) answer[i] = i+1;
		}
		
		// 모두 맞추지 못한 경우
		if(size == 0 ) {
			answer = new int[3];
			answer[0] = 1;
			answer[1] = 2;
			answer[2] = 3;
		}
		
		return answer;
		
	} 
}

