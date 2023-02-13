package programmers.pr2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class 모의고사 {

	public static void main(String[] args) {
		
		int[] 수포자1 = {1,2,3,4,5};
		int[] 수포자2 = {2,1,2,3,2,4,2,5};
		int[] 수포자3 = {3,3,1,1,2,2,4,4,5,5};

		int[] answers = {1,2,3,4,5};
		// int[] answers = {1,3,2,4,2};
		int[] answer = new int[3];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 0);
		map.put(2, 0);
		map.put(3, 0);

		for (int i = 0; i < answers.length; i++) {
			if(수포자1[i] == answers[i]) map.put(1, (map.get(1) + 1));
			if(수포자2[i] == answers[i]) map.put(2, (map.get(1) + 1));
			if(수포자3[i] == answers[i]) map.put(3, (map.get(1) + 1));
		}

		// Map.Entry 리스트 작성
		List<Entry<Integer, Integer>> list = new ArrayList(map.entrySet());

		// 비교함수 Comparator를 사용하여 오름차순으로 정렬
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		ArrayList<Integer> arr = new ArrayList<Integer>();
		// 결과 출력
		for(Entry<Integer, Integer> entry : list) {
			if(entry.getValue() != 0) {
				answer[entry.getKey()-1] = entry.getKey();
			}
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println(Arrays.toString(answer));
		
		int size = 0;
		for (int i = 0; i < answer.length; i++) {
			if(answer[i] != 0) size++; 
		}
		
		
		
		
		/*
		Sol9 s = new Sol9();
		int[] a;
		int[] answers = {1,2,3,4,5};
		a = s.solution(answers);
		System.out.println(Arrays.toString(a));
		
		int[] answers2 = {1,3,2,4,2};
		a = s.solution(answers2);
		System.out.println(Arrays.toString(a));
		*/
	}
}

class Sol9 {
	public int[] solution(int[] answers) {
		int[] answer = new int[3];
		int[] 수포자1 = {1,2,3,4,5};
		int[] 수포자2 = {2,1,2,3,2,4,2,5};
		int[] 수포자3 = {3,3,1,1,2,2,4,4,5,5};

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 0);
		map.put(2, 0);
		map.put(3, 0);

		for (int i = 0; i < answers.length; i++) {
			if(수포자1[i] == answers[i]) map.put(1, (map.get(1) + 1));
			if(수포자2[i] == answers[i]) map.put(2, (map.get(1) + 1));
			if(수포자3[i] == answers[i]) map.put(3, (map.get(1) + 1));
		}

		// Map.Entry 리스트 작성
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());

		// 비교함수 Comparator를 사용하여 오름차순으로 정렬
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		// 결과 출력
		for(Entry<Integer, Integer> entry : list) {
			answer[entry.getKey()-1] = entry.getKey();
			// System.out.println(entry.getKey() + " : " + entry.getValue());
		} // for
		
		return answer;
		
	} // class
}

