package programmers.pr2023.February;

public class 주사위의개수_20230206 {
    class Solution {
        public int solution(int[] box, int n) {
            int answer = 0;
            answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
            return answer;
        }
    }
}
