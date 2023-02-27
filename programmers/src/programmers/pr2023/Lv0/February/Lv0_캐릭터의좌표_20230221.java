package programmers.pr2023.Lv0.February;

// Solutuion 클래스 -> Solution2 클래스로 리팩토링 해보았음!
public class Lv0_캐릭터의좌표_20230221 {
    class Solution2 {
        public int[] solution(String[] keyinput, int[] board) {
            int[] answer = {0, 0};
            int leftRight = (board[0] - 1) / 2;
            int upDown = (board[1] - 1) / 2;

            for (int i = 0; i < keyinput.length; i++) {

                if ((keyinput[i].equals("left") || keyinput[i].equals("right")) && Math.abs(answer[0]) < leftRight) {
                    answer[0] += keyinput[i].equals("left") ? -1 : 1;
                }

                if ((keyinput[i].equals("left") || keyinput[i].equals("right")) && Math.abs(answer[0]) >= leftRight) {
                    if (keyinput[i].equals("left")) {
                        answer[0] = answer[0] <= -leftRight ? -leftRight : answer[0] - 1;
                    }

                    if (keyinput[i].equals("right")) {
                        answer[0] = answer[0] >= leftRight ? leftRight : answer[0] + 1;
                    }
                }

                if ((keyinput[i].equals("up") || keyinput[i].equals("down")) && Math.abs(answer[1]) < upDown) {
                    answer[1] += keyinput[i].equals("up") ? 1 : -1;
                }

                if ((keyinput[i].equals("up") || keyinput[i].equals("down")) && Math.abs(answer[1]) >= upDown) {
                    if (keyinput[i].equals("up")) {
                        answer[1] = answer[1] >= upDown ? upDown : answer[1] + 1;
                    }

                    if (keyinput[i].equals("down")) {
                        answer[1] = answer[1] <= -upDown ? -upDown : answer[1] - 1;
                    }
                }
            }

            return answer;
        }
    } // Solution2

    class Solution {
        public int[] solution(String[] keyinput, int[] board) {
            int[] answer = {0, 0};
            int leftRight = (board[0] - 1) / 2;
            int upDown = (board[1] - 1) / 2;

            for (int i = 0; i < keyinput.length; i++) {

                if ((keyinput[i].equals("left") || keyinput[i].equals("right")) && Math.abs(answer[0]) < leftRight) {
                    if (keyinput[i].equals("left")) {
                        answer[0] -= 1;
                    }

                    if (keyinput[i].equals("right")) {
                        answer[0] += 1;
                    }
                }

                if ((keyinput[i].equals("left") || keyinput[i].equals("right")) && Math.abs(answer[0]) >= leftRight) {
                    if (keyinput[i].equals("left") && answer[0] <= -leftRight) {
                        answer[0] = -leftRight;
                    }

                    if (keyinput[i].equals("left") && !(answer[0] <= -leftRight)) {
                        answer[0] -= 1;
                    }


                    if (keyinput[i].equals("right") && answer[0] >= leftRight) {
                        answer[0] = leftRight;
                    }

                    if (keyinput[i].equals("right") && !(answer[0] >= leftRight)) {
                        answer[0] += 1;
                    }
                }

                if ((keyinput[i].equals("up") || keyinput[i].equals("down")) && Math.abs(answer[1]) < upDown) {
                    if (keyinput[i].equals("up")) {
                        answer[1] += 1;
                    }

                    if (keyinput[i].equals("down")) {
                        answer[1] -= 1;
                    }
                }

                if ((keyinput[i].equals("up") || keyinput[i].equals("down")) && Math.abs(answer[1]) >= upDown) {
                    if (keyinput[i].equals("up") && answer[1] <= -upDown) {
                        answer[1] = upDown;
                    }

                    if (keyinput[i].equals("up") && !(answer[1] <= -upDown)) {
                        answer[1] += 1;
                    }

                    if (keyinput[i].equals("down") && answer[1] >= upDown) {
                        answer[1] -= 1;
                    }

                    if (keyinput[i].equals("down") && !(answer[1] >= upDown)) {
                        answer[1] = -upDown;
                    }
                }
            }
            return answer;
        }
    } // Solution

} // class
