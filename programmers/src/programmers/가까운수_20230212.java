package programmers;

import java.util.Arrays;

public class 가까운수_20230212 {
    class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;
            Arrays.sort(array); // 차이값이 같다면 작은 수가 리턴이 되어야 하므로 정렬
            int min = Math.abs(array[0] - n);
            int idx = 0;

            for(int i = 0; i <  array.length; i++){
                if(n == array[i]) {
                    return array[i];
                } else if(min > Math.abs(array[i] - n)) {
                    min = Math.abs(array[i] - n);
                    idx = i;
                }
            }

            return answer = array[idx];
        }
    }
}
