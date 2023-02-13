package programmers.pr2022;

import java.util.ArrayList;

public class 최소직사각형 {

	public static void main(String[] args) {
		// 4행 2열
		int answer = 0;
		
		int[][] sizes = {
							{60, 50}, 
							{30, 70}, 
							{60, 30}, 
							{80, 40}
						};
		
		int temp = 0, hmax = 0, wmax = 0;
		
		for (int i = 0; i < sizes.length; i++) {
			if(sizes[i][1] > sizes[i][0]) {
				temp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = temp;
			} // if
		} // for i

		for (int j = 0; j < sizes.length; j++) {
			hmax = sizes[j][0] > hmax ? sizes[j][0] : hmax;
			wmax = sizes[j][1] > wmax ? sizes[j][1] : wmax;
		} // for i
		
		answer = hmax * wmax;
		System.out.println(answer);


/*
		int max = 0;

		ArrayList<Integer> list = new ArrayList();
		
		for(int i=0; i < sizes.length; i++) {
			max = max < (sizes[i][0] * sizes[i][1]) ? (sizes[i][0] * sizes[i][1]) : max;
		}
		
		for(int i=0; i < sizes.length; i++) {		
			for(int j=0; j <sizes.length; j++) {
				if(i!=j && sizes[i][0] * sizes[j][1] >= max) {
					list.add(sizes[i][0] * sizes[j][1]);
					System.out.println( i + "0 * " + j + "1 = " + sizes[i][0] * sizes[j][1] );
				}
				
			} // for j
		} // for i
		int result = Collections.min(list);
		System.out.println("답:"+result);
*/		
		// 조건 : 2차원 배열에서 제일 큰 값보다 같거나 크지만 그 중에서 제일 작은 값
		
		// ArrayList<Integer> maxList = new ArrayList();
		/*
		int max2 = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) >= max) {
				max2 = 
				System.out.println(list.get(i));
				// result = result <= list.get(i) ? result : list.get(i);
			}
		}
		int result = Collections.min(maxList);
		System.out.println("답:"+result);
*/
	
		/*
		int a;
		Sol7 s = new Sol7();
		a = s.solution(sizes);
		System.out.println(a);
		
		a = s.solution(sizes2);
		System.out.println(a);
		*/
	}

}

// 두 개의 모서리를 비교하여 큰 값을 전부 가로 작은 값을 전부 세로로 두면
// 각 모서리의 길이의 최댓값이 답이 되지않을까?
class Sol7 {
    public int solution(int[][] sizes) {
        int answer = 0;
		int max = 0;

		ArrayList<Integer> list = new ArrayList();
		
		for(int i=0; i < sizes.length; i++) {
			max = max < (sizes[i][0] * sizes[i][1]) ? (sizes[i][0] * sizes[i][1]) : max;
		}
		
		for(int i=0; i < sizes.length; i++) {		
			for(int j=0; j <sizes.length; j++) {
				if(i!=j && sizes[i][0] * sizes[j][1] >= max) list.add(sizes[i][0] * sizes[j][1]);
			} // for j
		} // for i
		
		int min = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			min = min > list.get(i) ? list.get(i) : min;
		}
		
		answer = min;
        
        return answer;
    }
}
