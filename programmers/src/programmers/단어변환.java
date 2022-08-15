package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 단어변환 {
    
    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

    }
}

class Solution17 {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;

        // boolean[] visited = new boolean[words.length];
        int[] visited = new int[words.length];

        Queue<Integer> q = new LinkedList<>();

        int cnt;

        for (int i = 0; i < words.length; i++) {

            cnt = 0;
            for (int j = 0; j < begin.length(); j++) { // 한글자 차이나는 것을 찾는거
                if(begin.charAt(j) == words[i].charAt(j)) cnt++;
            } // for j

            if(cnt == begin.length()-1) { // 단어 차이가 1개일 경우에만
                q.offer(i); // 큐에 추가
                visited[i] = 1; // 방문 처리
            } // if

        } // for i

        while (!q.isEmpty()) {
            // 와일문 나가버려
            int x = q.poll(); // 0(hot 인덱스)

            for (int i = 0; i < words.length; i++) {
                // 0이 아니면 방문을 했기때문에 다시 방문하지않겠다.
                if(visited[i] != 0) continue;

                cnt = 0;
                for (int j = 0; j < words[i].length(); j++) {
                    if(words[x].charAt(j) == words[i].charAt(j)) cnt++;
                }

                if (cnt == words[i].length()-1){
                    q.offer(i);
                    visited[i] = visited[x] + 1;
                }
            }

        } // while

        for (int i = 0; i < words.length; i++) {
            if (target.equals(words[i])) {
                answer = visited[i];
                break;
            }
        }

        return answer;
    }
}
