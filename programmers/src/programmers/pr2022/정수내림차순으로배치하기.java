package programmers.pr2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {

        long n = 118372;
        long answer = solution(n);
        System.out.println(answer);

    }


    public static long solution(long n) {
        long answer = 0;

        String str = n + "";

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(Integer.parseInt(str.charAt(i)+""));
        }

        Collections.sort(list, Collections.reverseOrder());

        str = "";
        for (int i = 0; i < list.size(); i++) {
            str += list.get(i) + "";
        }

        answer = Long.parseLong(str);

        return answer;
    }

}
