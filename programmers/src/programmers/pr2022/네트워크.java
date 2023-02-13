package programmers.pr2022;

import java.util.Stack;

public class 네트워크 {

    public static void main(String[] args) {

        int n = 3;

        int[][] computers = {
                {1, 1, 0},
                {1, 1, 1},
                {0, 1, 1}
        };

        Sol17 s = new Sol17();
        System.out.println(s.solution(n, computers));
    }

}

class Sol17 {
    public int solution(int n, int[][] computers) {
        int answer = 0;

        boolean[] visited = new boolean[n]; // 방문 처리를 할 불린 배열 생성

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            s.push(i);
            answer++;

            while (!s.isEmpty()) {
                int x = s.pop();
                visited[x] = true;
                for (int j = 0; j < n; j++) {
                    if (computers[x][j] == 1 && !visited[j]) { // j가 x가 되면 통과를 못함
                        s.push(j);
                    }
                }
            }

        }

        return answer;
    }
}

