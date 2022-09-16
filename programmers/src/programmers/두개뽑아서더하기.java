package programmers;

import java.util.*;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i == j) {
                    continue;
                }
                else {
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);

    }

    public static int[] solution(int[] numbers) {
        int[] answer = {};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i == j) {
                    continue;
                }
                else {
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
