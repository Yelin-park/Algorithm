package programmers.pr2025.Lv2;

import javafx.util.Pair;
import java.util.*;

/**
 * https://velog.io/@jmjgirl/JAVA-Stack%EA%B3%BC-Queue%EC%97%90-%EB%8C%80%ED%95%B4-%EC%95%8C%EC%95%84%EB%B3%B4%EC%9E%90#deque-double-ended-queue
 */
public class Lv2_프로세스_20250421 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] priorities = {2, 1, 3, 2}; // 대기큐
        int location = 2;

        //int[] priorities = {1, 1, 9, 1, 1, 1}; // 대기큐
        //int location = 0;

        int answer = solution.solution(priorities, location);
        System.out.println("answer = " + answer);
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll(); // 현재 프로세스를 꺼내고,

            // 나머지 중 더 높은 우선순위가 있는지 확인하기
            boolean hasHigher = false;
            for (int[] q : queue) {
                if (q[1] > current[1]) {
                    hasHigher = true;
                    break;
                }
            }

            if (hasHigher) {
                // 우선순위 더 높은게 있으면 큐에 다시 넣고,
                queue.offer(current);
            } else {
                answer++; // 없으면 프로세스를 실행하므로 증가
                if (current[0] == location) { // 원하는 위치의 프로세스와 같다면 실행 순서를 리턴
                    return answer;
                }
            }
        }

        return answer;
    }

    public int solution2(int[] priorities, int location) {
        int answer = 0;

        ArrayList<Pair<Integer, Integer>> list = new ArrayList<>();
        for (int i = 0; i < priorities.length; i++) {
            list.add(new Pair<>(priorities.length - i - 1, priorities[i]));
        }

        list.sort(Comparator.comparingInt(Pair::getValue));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getKey() == location) {
                answer = i + 1;
            }
        }

        return answer;
    }
}


