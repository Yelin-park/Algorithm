package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class 피보나치수5_10870 {

	public static void main(String[] args) {
		int n, answer;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n >= 0 && n <= 20) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(0);
			list.add(1);
			list.add(1);

			if(n == 0 || n == 1 || n == 2) {
				answer = list.get(n);
			} else {
				if(list.size()-1 == n && list.get(n) != 0) {
					answer = list.get(n);
				} else {
					for (int i = 3; i <= n; i++) {
						list.add(list.get(i-1) + list.get(i-2));
					}
					answer = list.get(n);
				} // if else
			} // if
			System.out.println(answer);
		} // if


	}

}
