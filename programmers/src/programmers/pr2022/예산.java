package programmers.pr2022;

import java.util.Arrays;

public class 예산 {

	public static void main(String[] args) {
		// int[] d = {1,3,2,5,4};
		int[] d = {2,2,3,3};
		int budget = 10;
		int answer = 0;
		// int change = budget;
		
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
		
		// 예산이 0보다 같거나 크고 남은 예산이 그 다음 신청금액보다는 커야함
		for (int i = 0; i < d.length; i++) {
			if(budget >= d[i]) {
				budget -= d[i];
				answer++;
			}
		}
		
		System.out.println(answer);
	}

}
