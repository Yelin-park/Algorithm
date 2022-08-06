package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로탐색_2178 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] miro = new int[n][m];
		boolean[][] visited = new boolean[n][m];
		
		// 미로 그리기
		for (int i = 0; i < n; i++) {
			String smiro = sc.next();
			for (int j = 0; j < smiro.length(); j++) {
				// char로 들어오기 때문에 숫자로 변환해주기
				miro[i][j] = Integer.parseInt(String.valueOf(smiro.charAt(j)));
			}
		} 
		
		int[] xpoint = {-1, 1, 0, 0}; // [위, 아래,] 왼쪽, 오른쪽
		int[] ypoint = {0, 0, -1, 1}; // 위, 아래, [왼쪽, 오른쪽]
		
		Queue<int[]> q = new LinkedList<>();
		
		int[] arr = {0, 0};
		q.offer(arr); // 큐에 최상단 노드 추가
		visited[0][0] = true; // 해당 노드 방문 처리

		int x, y;
		int now[];
		while (!q.isEmpty()) { // 큐가 빌때까지 반복
			now = q.poll(); // 큐에서 하나의 노드를 꺼냄
			x = now[0]; // x좌표
			y = now[1]; // y좌표

			// 위, 아래, 왼쪽, 오른쪽을 돌기
			for (int i = 0; i < xpoint.length; i++) {
				int nextX = x + ypoint[i]; // 다음 x좌표 -1 1 0 0
				int nextY = y + xpoint[i]; // 다음 y좌표 0 0 -1 1

				// 이동할 좌표가 없는 경우(음수이거나 n,m과 같거나 큰 값) 계속
				if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) continue;
				// 방문했던 곳이거나 미로에 0인 경우 계속
				if(visited[nextX][nextY] || miro[nextX][nextY] == 0) continue;

				q.add(new int[] {nextX, nextY}); // 이동할 좌표를 큐에 추가
				miro[nextX][nextY] = miro[x][y]+1; // 기준 좌표에 +1을 하여서 다음 좌표 값에 추가하기
				visited[nextX][nextY] = true; // 해당 좌표 방문처리
			} // for i 
		} // while
		
		sc.close();
		System.out.println(miro[n-1][m-1]); // 도착지점에서의 최종칸수
		
	} // main
	
} // class


