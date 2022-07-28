package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class 서강근육맨_20300 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 운동기구 개수
		long[] t = new long[n]; // 근손실 정도 배열
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 근손실 정도
		
		for (int i = 0; i < n; i++) {
			t[i] = Long.parseLong(st.nextToken());
		} // for

		Arrays.sort(t);
				
		long max = 0;
		
		if( n % 2 == 0) { // 운동기구 짝수
			for (int i = 0; i < (n/2); i++) {
				max = t[i] + t[n-1-i] > max ? t[i] + t[n-1-i] : max;
			}
		} else { // 운동기구 홀수
			if(n == 1) {
				max = t[0];
			} else {
				max = (int) t[n-1];
				for (int i = 0; i < (n-1)/2; i++) {
					max = t[i] + t[n-2-i] > max ? t[i] + t[n-2-i] : max;
				}
			}
		}
		
		System.out.println(max);

	} // main

} // class
