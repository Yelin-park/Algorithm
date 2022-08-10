package programmers;

import java.util.HashMap;

public class 위장 {

	public static void main(String[] args) {
		String[][] clothes = {
								{"yellow_hat", "headgear"}, 
								{"blue_sunglasses", "eyewear"}, 
								{"green_turban", "headgear"}
							};

		Sol15 s = new Sol15();
		System.out.println(s.solution(clothes));
		
	} // main

} // class

class Sol15 {
    public int solution(String[][] clothes) {
        int answer = 1; // 종류별로 곱할 예정이라 1로 할당
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        // 경우의 수는 종류+1 이다. 0인 경우도 포함해야하기 때문에!
        // 조건에 최소 한 개는 입기 때문에 여기서 -1도 해주어야 함
        // ex) (A+1)*(B+1)-1
        
     // 옷의 타입별로 종류가 몇개인지 체크하는 것
        for (int i = 0; i < clothes.length; i++) {
			String type = clothes[i][1]; // 옷의 타입을 가져오기
			// getOrDefault 메서드로 해당 키 값(옷의 타입)이 존재한다면 해당 key의 value를, 없다면 1로 가져와서 map에 추가하기
			map.put(type, map.getOrDefault(type, 1) + 1);
		} // for i
        
        for (String key : map.keySet()) {
        	// 옷의 타입에 따른 종류를 곱하기
			answer *= map.get(key);
		} // foreach
        
        return answer - 1; // 최소 한 개를 입는 경우 때문에 -1을 해줌
    }
}
