package programmers;

import java.util.ArrayList;
import java.util.Arrays;


public class 실패율 {
    public static void main(String[] args) {
        int N = 5; // 전체 스테이지 개수
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3}; // 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 N+1은 마지막 스테이지까지 클리어한 사용자

        // int N = 4;
        // int[] stages = {4,4,4,4,4};
        // 실패율이 높은 스테이지부터 내림차순으로 스테이지 번호 return
        // 만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하기
        // 스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0

        // 실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수

         /*
         1 1 / 7 14
         2 2 / 5 40
         3 2 / 2 100
         4 1 / 1 100
         5 0
         3 4 2 1 5
          */

        Solution20 s = new Solution20();
        int[] arr = s.solution(N, stages);
        System.out.println(Arrays.toString(arr));
    }
}

class Solution20 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        ArrayList<double[]> list = new ArrayList<>();
        int noClearPlayers, clearPlayers;

        for (int i = 1; i <= N; i++) {
            noClearPlayers = 0;
            clearPlayers = 0;
            for (int j = 0; j < stages.length; j++) {
                if (i == stages[j]) { // 스테이지에 도달한 플레이어 수 구하기
                    clearPlayers++;
                }
                if (i <= stages[j]) { // 스테이지에 도달했으나 아직 클리어하지 못한 플레이어 수 구하기
                    noClearPlayers++;
                }
            }

            // 클리어한 플레이어 수가 0이면 실패율 0으로
            if (noClearPlayers == 0) {
                list.add(new double[]{i, 0.0});
            } else {
                list.add(new double[]{i, ((double) clearPlayers / noClearPlayers) * 100});
            }
        } // for i

        list.sort((a, b) -> Double.compare(b[1], a[1]));

        for (int i = 0; i < list.size(); i++) {
            answer[i] = (int) list.get(i)[0];
        }

        return answer;
    }
}


