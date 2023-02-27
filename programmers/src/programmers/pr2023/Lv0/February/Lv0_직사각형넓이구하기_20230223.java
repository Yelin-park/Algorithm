package programmers.pr2023.Lv0.February;

public class Lv0_직사각형넓이구하기_20230223 {
    class Solution {
        public int solution(int[][] dots) {
            int answer = 0;
            int maxX = dots[0][0];
            int minX = dots[0][0];
            int maxY = dots[0][1];
            int minY = dots[0][1];
            // 가장 큰  x - 가장 작은 x = 가로
            // 가장 큰  y - 가장 작은 y = 세로
            for (int i = 0; i < dots.length; i++) {
                maxX = dots[i][0] > maxX ? dots[i][0] : maxX;
                minX = dots[i][0] > minX ? minX : dots[i][0];
                maxY = dots[i][1] > maxY ? dots[i][1] : maxY;
                minY = dots[i][1] > minY ? minY : dots[i][1];
            }
            return answer = Math.abs((maxX - minX) * (maxY - minY));
        }
    }

}

