package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 블랙잭_2798 {
	static int N; // 카드의 개수
	static int M; // 합
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nm = br.readLine();
		String[] nmArr = new String[2];
		nmArr = nm.split("\\s");
		N = Integer.parseInt(nmArr[0]);
		M = Integer.parseInt(nmArr[1]);
		
		String[] sCardNum = new String[N];
		sCardNum = br.readLine().split("\\s");
		
		int[] cardArr = new int[N];
		for (int i = 0; i < N; i++) {
			cardArr[i] = Integer.parseInt(sCardNum[i]);
		}
		
		int max = 0, temp = 0;
		boolean[] tf = new boolean[3];
		for (int i = 0; i < cardArr.length; i++) {
			for (int j = i+1; j < cardArr.length; j++) {
				for (int k = j+1; k < cardArr.length; k++) {
					temp = cardArr[i] + cardArr[j]+ cardArr[k];
					max = M >= temp && temp > max ? temp : max;
				}
			}
		}

		System.out.println(max);

	} // main

} // class
