package programmers;

import java.util.Arrays;
import java.util.HashSet;

public class 신고결과받기 {

	// 1명의 유저는 같은 유저를 여러 번 신고할 수 없음
	/*
	 * 이용자의 ID가 담긴 문자열 배열 id_list 각 이용자가 신고한 이용자의 ID 정보가 담긴 문자열 배열 report 정지 기준이 되는
	 * 신고 횟수 k가 매개변수로 주어질 때 각 유저별로 처리 결과 메일을 받은 횟수를 배열에 담아 return 하도록 solution 함수를 완성해주세요.
	 */

	public static void main(String[] args) {
				
		String[] id_list = {"muzi", "frodo", "apeach", "neo"}; // [1, 2, 0, 2]
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		Sol solution = new Sol();
		int[] answer = solution.solution(id_list, report, k);
		System.out.println(Arrays.toString(answer));
		
	} // main

} // class

class Sol {
    public int[] solution(String[] id_list, String[] report, int k) {
    	// 신고한 정보 중복 제거
		HashSet<String> hs = new HashSet(Arrays.asList(report));
		String[] reportDup = hs.toArray(new String[0]);
		
    	int[] answer = new int[id_list.length];
    	int[] num = new int[id_list.length]; // 신고당한횟수

    	for (int i = 0; i < num.length; i++) {
    		num[i] = 0;
    	} // for

    	for (int j = 0; j < num.length; j++) {
    		
    		for (int i = 0; i < reportDup.length; i++) {
    			
    			String id = String.join("", reportDup[i].split("\\s+")[0]); // 신고한id
    			String reId = String.join("", reportDup[i].split("\\s+")[1]); // 신고당한id
    			
    			if (reId.equals(id_list[j])) { 
    				num[j]++; // 해당 id의 신고당한횟수 증가
    			} // if
    			answer[j] = num[j];
    		} // for i
    		
    		/*
			// 신고당한ID의 신고횟수가 k 이상인 경우 신고당한ID를 신고한 ID의 처리결과 횟수 1증가
			if(num[j] >= k) {
				String kreId = String.join("", reportDup[j].split("\\s+")[1]); // 신고당한id
				for (int z = 0; z < reportDup.length; z++) {
					String kreId2 = String.join("", reportDup[z].split("\\s+")[1]);
					if( kreId.equals(kreId2)) { 
						if (kreId2.equals(id_list[j])) {
							answer[j]++;
						}
					} // if
				} // for z
			} // if
			*/
    		
    	} // for j
    	
    	return answer;
    	
    } // solution
    
} // class





