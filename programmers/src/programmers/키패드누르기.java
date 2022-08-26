package programmers;

public class 키패드누르기 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

    }
}

class Solution28 {
    // 왼손 1,4,7
    // 오른손 3,6,9
    // 가까운 손이 2,5,8,0 만약 거리가 같다면 XX손잡이인 걸 기준으로 누르기

    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftT = 10, rightT = 12;
        int leftcnt, rightcnt;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) { // 무조건 왼손이 눌러야 하는 번호(1,4,7)
                answer += "L";
                leftT = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) { // 무조건 오른손이 눌러야 하는 번호(3,6,9)
                answer += "R";
                rightT = numbers[i];
            } else { // 2,5,8,0일 때
                if(numbers[i] == 0) numbers[i] = 11; // *은 10, 0은 11, #은 12
                // 상하 3씩차이 좌우는 1씩 차이
                // 나누기로 상하 거리, 나머지로 좌우 거리 구하기

                leftcnt = (Math.abs(numbers[i] - leftT)) / 3 + (Math.abs(numbers[i] - leftT)) % 3;
                rightcnt = (Math.abs(numbers[i] - rightT)) / 3 + (Math.abs(numbers[i] - rightT)) % 3;

                // 더 짧은 거리인 걸 추가하기
                if (leftcnt < rightcnt) { 
                    answer += "L";
                    leftT = numbers[i];
                } else if(leftcnt > rightcnt){
                    answer += "R";
                    rightT = numbers[i];
                } else{ // 같은 경우에는 오른손 잡이, 왼손잡이에 따라 추가
                    if(hand.equals("right")){
                        answer += "R";
                        rightT = numbers[i];
                    } else {
                        answer += "L";
                        leftT = numbers[i];
                    }
                }
            }
        } // for
        return answer;
    }
}
