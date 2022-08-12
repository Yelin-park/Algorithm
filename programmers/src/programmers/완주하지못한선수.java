package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class 완주하지못한선수 {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
		HashMap<String, Integer> map = new HashMap<String, Integer>();
        
		// 참가한 선수를 map에 넣기 만약 같은 이름의 선수가 있다면 2,3,4 이런식으로 숫자가 계속 증가됨
		for (String player : participant) {
			map.put(player, map.getOrDefault(player, 0) + 1);
		}
		
		// 완주한 선수가 있다면 해당 key 값의 value를 -1 시킴
		// 같은 이름의 선수가 2명 3명이여도 완주한 선수의 이름이 참가한 선수만큼 있다면 0이 되어짐
		for (String player : completion) {
			map.put(player, map.get(player)-1);
		}
        
		// 0이 아닌경우는 완주하지 못한 선수이므로 answer에 key 값을 추가하기
        for (String key : map.keySet()) {
			if(map.get(key) != 0) {
				answer += key;
			}
		}

        return answer;
    }
    
	public static void main(String[] args) {
		String answer = "";
		String[] participant = {"mislav", "stanko", "mislav", "ana", "mislav"};
		String[] completion = {"stanko", "ana", "mislav"};
		// String[] participant = {"leo", "kiki", "eden"};
		// String[] completion = {"eden", "kiki"};

		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
        
		for (String player : participant) {
			map.put(player, map.getOrDefault(player, 0) + 1);
		}
		
		for (String player : completion) {
			map.put(player, map.get(player)-1);
		}
        
        for (String key : map.keySet()) {
			if(map.get(key) != 0) {
				answer += key;
			}
		}
        
        System.out.println(map);
        System.out.println(answer);
		
	}

}
