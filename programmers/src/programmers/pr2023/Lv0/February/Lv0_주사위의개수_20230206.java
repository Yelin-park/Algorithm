package programmers.pr2023.Lv0.February;

public class Lv0_주사위의개수_20230206 {
    class Solution {
        public int solution(int[] box, int n) {
            int answer = 0;
            answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
            return answer;
        }
    }
}
