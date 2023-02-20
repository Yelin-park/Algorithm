package programmers.pr2023.February;

import java.util.Arrays;

// 해당 문제의 테스트 케이스 추가가 필요할 것으로 보임. 프로그래머스의 문제의 조건이 문제가 있어보임
public class 외계어사전_20230220 {
    class Solution {
        public int solution(String[] spell, String[] dic) {
            int answer = 2;
            Arrays.sort(spell);
            String spellStr = "";
            for (int i = 0; i < spell.length; i++) {
                spellStr += spell[i];
            }

            for(int i = 0; i < dic.length; i++){
                char[] temp = dic[i].toCharArray();
                Arrays.sort(temp);
                dic[i] = String.valueOf(temp);
                if(dic[i].equals(spellStr)) return 1;
            }

            return answer;
        }
    }
}



