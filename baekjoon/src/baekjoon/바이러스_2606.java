package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 바이러스_2606 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] graph = new int[n][n];
		boolean[] visited = new boolean[n];

		// 그래프 그리기
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			graph[a][b] = 1;
			graph[b][a] = 1;
		}
		
		Queue<Integer> q = new LinkedList<Integer>();

		q.offer(1); // 큐에 최상단 노드 추가
		visited[0] = true; // 해당 노드 방문 처리

		int cnt = -1, y;

		// 큐가 빌때까지 반복
		while (!q.isEmpty()) {
			y = q.poll(); // 큐에서 하나 꺼냄
			cnt++;
			
			for (int i = 0; i < n; i++) {
				int z = graph[y-1][i];
				if(z == 1) { // 1인 경우는 연결된 노드
					if(!visited[i]) { // i번째 노드를 방문하지 않았다면
						q.offer(i+1); // q에 추가한 뒤
						visited[i] = true; // 방문 처리
					} // if
				} // if
			} // for
		} // while

		System.out.println(cnt);

	} // main


} // class
