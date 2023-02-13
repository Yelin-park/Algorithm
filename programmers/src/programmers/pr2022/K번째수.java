package programmers.pr2022;

import java.util.ArrayList;
import java.util.Collections;

public class K번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};

        K번째수 s = new K번째수();
        s.solution(array, commands);
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
                list.add(array[j]);
            }

            Collections.sort(list);

            answer[i] = list.get(commands[i][2]-1);

            list.clear();

        }
        return answer;
    }
}
