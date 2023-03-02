package programmers.pr2023.Lv0.March;

public class Lv0_저주의숫자3_20230302 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            int[] threeXArr = new int[100];
            threeXArr[0] = 1;
            threeXArr[1] = 2;
            for (int i = 2; i < threeXArr.length; i++) {
                if ((threeXArr[i - 1] + 1) % 3 != 0) {
                    if (!String.valueOf(threeXArr[i - 1] + 1).contains("3")) {
                        threeXArr[i] = threeXArr[i - 1] + 1;
                    } else {
                        int temp = threeXArr[i - 1] + 2;
                        while (String.valueOf(temp).contains("3") || temp % 3 == 0) {
                            temp++;
                        }
                        threeXArr[i] = temp;
                    }

                }

                if ((threeXArr[i - 1] + 1) % 3 == 0) {
                    int temp = threeXArr[i - 1] + 2;
                    while (String.valueOf(temp).contains("3") || temp % 3 == 0) {
                        temp++;
                    }
                    threeXArr[i] = temp;

                }
            }

            // 풀이2)
            /*
            for (int i = 1; i <= n; i++) {
                answer++;
                if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                    i--;
                }
            }
            */

            return answer = threeXArr[n - 1];
        }
    }
}
