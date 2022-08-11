package baekjoon;

import java.util.HashMap;
import java.util.Scanner;

public class 문자열집합_14425 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < N; i++) {
			map.put(sc.next(), 1);
		}

        for (int i = 0; i < M; i++) {
            String str = sc.next();
            if (map.get(str) != null) {
            	answer++;
            }
        }	
		
		System.out.println(answer);
	} // main
	
} // class

/*
baekjoononlinejudge
startlink
codeplus
sundaycoding
codingsh
baekjoon
codeplus
codeminus 
startlink
starlink
sundaycoding
codingsh
codinghs
sondaycoding
startrink
icerink
*/