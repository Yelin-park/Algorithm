package programmers.pr2023.Lv1.March;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lv1_가장가까운같은글자_20230313 {
    public static void main(String[] args) {
        String s = "banana";
        //String s = "foobar";
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(s)));

    }
    static class Solution {
        public int[] solution(String s) {
            int[] answer = new int[s.length()];

            char[] charArr = s.toCharArray();
            Set<Character> set = new HashSet<>();
            for(int i = 0; i < charArr.length; i++){
                set.add(charArr[i]);
            }

            // 맨 처음 나온 값들은 -1로 채우기
            Iterator<Character> iterator = set.iterator();
            while(iterator.hasNext()){
                char temp = iterator.next();
                int tempno = s.indexOf(temp);
                answer[s.indexOf(temp)] = -1;

                for (int i = 0; i < charArr.length; i++) {
                    if(i != tempno) { // 맨처음 나온 값의 idx가 아니면서
                        if(temp == charArr[i]) { // 맨 처음 나온 값과 charArr 배열의 요소가 같다면
                            answer[i] = i - tempno; // i번째의 위치 - 맨 처음 나온 값의 위치를 answer 배열에 할당
                            tempno = i; // tempno에는 그 다음에 존재하는 값의 위치를 넣어줌(가장 가까운 값으로 표시하기 위함)
                        }
                    }
                }
            }

            return answer;
        }
    }
}
