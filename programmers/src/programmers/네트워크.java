package programmers;

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

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(computers, i, visited);
                answer++;
            }
        }

        return answer;
    }

    boolean[] dfs(int[][] computers, int i, boolean[] visited) {
        visited[i] = true;

        for (int j = 0; j < computers.length; j++) {
            if (i != j && computers[i][j] == 1 && visited[j] == false) {
                visited = dfs(computers, j, visited);
            }
        }

        return visited;
    }

}

