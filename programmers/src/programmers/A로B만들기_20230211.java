package programmers;

import java.util.Arrays;

public class A로B만들기_20230211 {

    class Solution {
        public int solution(String before, String after) {
            int answer = 0;

            char[] beforeArr = before.toCharArray();
            char[] afterArr = after.toCharArray();
            Arrays.sort(beforeArr);
            Arrays.sort(afterArr);

            // 아래와 같이 배열이 같은지 비교를 하게되면 for문을 돌지 않고 확인할 수 있음
            // return new String(a).equals(new String(b)) ? 1 :0;
            for(int i = 0; i < beforeArr.length; i++){
                if(beforeArr[i] == afterArr[i]) {
                    answer++;
                }
            }

            if(answer == afterArr.length) {
                return 1;
            } else {
                return 0;
            }

        }
    }
}
