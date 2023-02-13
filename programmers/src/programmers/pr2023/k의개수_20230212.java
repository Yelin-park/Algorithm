package programmers.pr2023;

public class k의개수_20230212 {
    class Solution {
        public int solution(int i, int j, int k) {
            int answer = 0;

            for (int z = i; z <= j; z++) {
                char[] tempArr = String.valueOf(z).toCharArray();
                for(int x = 0; x < tempArr.length; x++){
                    if(String.valueOf(tempArr[x]).equals(String.valueOf(k))) {
                        answer++;
                    }
                }
            }

            return answer;
        }
    }
}
