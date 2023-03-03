package programmers.pr2023.Lv0.March;

public class Lv0_특이한정렬_20230303 {
    class Solution {
        public int[] solution(int[] numlist, int n) {
            int[] answer = new int[numlist.length];
            // n과 가까운 수가 앞으로
            // n과의 거리가 같다면 더 큰 수를 앞에 오도록

            for(int i=0; i < numlist.length; i++){
                for(int j=0; j < numlist.length-1; j++){
                    // 양수이면 값이 큰 것. 음수이면 값이 작은 것
                    if(numlist[j] - n == 0){ // 차이가 0이라면 같은 것으로 맨 앞에 위치
                        int temp = numlist[0];
                        numlist[0] = numlist[j];
                        numlist[j] = temp;
                    }

                    if(Math.abs(numlist[j] - n) > Math.abs(numlist[j+1] - n)) {
                        int temp = numlist[j];
                        numlist[j] = numlist[j+1];
                        numlist[j+1] = temp;
                    }

                    if(Math.abs(numlist[j] - n) == Math.abs(numlist[j+1] - n)) {
                        if(numlist[j+1] > numlist[j]) {
                            int temp = numlist[j];
                            numlist[j] = numlist[j+1];
                            numlist[j+1] = temp;
                        }
                    }
                }
            }

            return answer = numlist;
        }
    }
}
