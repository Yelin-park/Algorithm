package programmers.pr2023.Lv0.March;

public class Lv0_평행_20230315 {
    public static void main(String[] args) {
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        Solution s = new Solution();
        System.out.println(s.solution(dots));
    }

    static class Solution {
        // 직선의 기울기는 x의 변화값과 y의 변화값(y/x) 즉, y1-y2 /x1-x2
        // 직선의 평행 조건 : 기울기가 같되 y절편이 달라야 한다. (기울기가 다를 경우 or y절편이 같을 경우 -> 무조건 만나게 된다. 기울기는 같되 y절편도 같을 경우 -> 두 직선은 일치한다.)
        public int solution(int[][] dots) {
            int answer = 0;

            if(findSlope(dots[0], dots[1]) == findSlope(dots[2], dots[3])) {
                answer++;
            } else if(findSlope(dots[0], dots[2]) == findSlope(dots[1], dots[3])) {
                answer++;
            } else if(findSlope(dots[0], dots[3]) == findSlope(dots[1], dots[2])) {
                answer++;
            }

            return answer;
        }

        public double findSlope(int[] dot1, int[] dot2) {
            return (double) (dot1[1] - dot2[1]) / (dot1[0] - dot2[0]); // y1-y2 / x1-x2 == 기울기
        }

    }

}
