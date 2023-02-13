package programmers.pr2022;

import java.util.ArrayList;
import java.util.HashMap;

public class 성격유형검사하기 {
    // 비동의쪽 선택시 첫번째 캐릭터 유형 3 2 1
    // 동의쪽 선택시 두번째 캐릭터 유형 3 2 1

    /*
    RT
    CF
    JM
    AN

    choices	뜻
    1	매우 비동의
    2	비동의
    3	약간 비동의
    4	모르겠음
    5	약간 동의
    6	동의
    7	매우 동의
     */
    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"}; // NCMTA
        int[] choices = {5, 3, 2, 7, 5};

        Solution22 s = new Solution22();
        String answer = s.solution(survey, choices);
        System.out.println(answer);

    }

}

class Solution22 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < choices.length; i++) {
            switch (choices[i]){
                case 1:
                    map.put(survey[i].charAt(0), map.getOrDefault(survey[i].charAt(0), 0) + 3);
                    break;
                case 2:
                    map.put(survey[i].charAt(0), map.getOrDefault(survey[i].charAt(0), 0) + 2);
                    break;
                case 3:
                    map.put(survey[i].charAt(0), map.getOrDefault(survey[i].charAt(0), 0) + 1);
                    break;
                case 5:
                    map.put(survey[i].charAt(1), map.getOrDefault(survey[i].charAt(1), 0) + 1);
                    break;
                case 6:
                    map.put(survey[i].charAt(1), map.getOrDefault(survey[i].charAt(1), 0) + 2);
                    break;
                case 7:
                    map.put(survey[i].charAt(1), map.getOrDefault(survey[i].charAt(1), 0) + 3);
                    break;
            }
        }

        // System.out.println(map);

        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(new int[2]);
        }

        // RTCFJMAN
        for (char key: map.keySet()) {
            switch (key){
                case 'R':
                    list.get(0)[0] = map.get(key);
                    break;
                case 'T':
                    list.get(0)[1] = map.get(key);
                    break;
                case 'C':
                    list.get(1)[0] = map.get(key);
                    break;
                case 'F':
                    list.get(1)[1] = map.get(key);
                    break;
                case 'J':
                    list.get(2)[0] = map.get(key);
                    break;
                case 'M':
                    list.get(2)[1] = map.get(key);
                    break;
                case 'A':
                    list.get(3)[0] = map.get(key);
                    break;
                case 'N':
                    list.get(3)[1] = map.get(key);
                    break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            // System.out.println(Arrays.toString(list.get(i)));
            switch (i){
                case 0:
                    answer += list.get(i)[0] < list.get(i)[1] ? "T" : "R";
                    break;
                case 1:
                    answer += list.get(i)[0] < list.get(i)[1] ? "F" : "C";
                    break;
                case 2:
                    answer += list.get(i)[0] < list.get(i)[1] ? "M" : "J";
                    break;
                case 3:
                    answer += list.get(i)[0] < list.get(i)[1] ? "N" : "A";
                    break;
            }
        }


        return answer;
    }
}
