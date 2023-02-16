package programmers.pr2023.February;

public class 공던지기_20230215 {
    class Solution {
        public int solution(int[] numbers, int k) {
            // 한줄 코딩 : 규칙을 찾아서 아래와 같이 한줄 코딩 가능
            // return numbers[((k-1)*2)%numbers.length];
            
            int answer = 0;
            int temp = 0;
            int[] ballPass = new int[k];

            int i = 1;
            int j = 0;
            ballPass[0] = numbers[0]; // 시작은 1번이 공을 가지고 있음

            while(i < k) {
                if(j+2 < numbers.length) {
                    j += 2;
                    ballPass[i] = numbers[j];
                } else {
                    j = j + 2 - numbers.length;
                    ballPass[i] = numbers[j];
                }
                i++;
            }

            answer = ballPass[ballPass.length-1];

            return answer;
        }
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int k = 5;

        int answer = 0;
        int temp = 0;
        int[] ballPass = new int[k];

        int i = 1;
        int j = 0;
        ballPass[0] = numbers[0]; // 시작은 1번이 공을 가지고 있음
        while(i < k) {
            System.out.println("i = " + i);
            if(j+2 < numbers.length) {
                j += 2;
                System.out.println("if j = " + j);
                ballPass[i] = numbers[j];
                System.out.println("if num = " + numbers[j]);
            } else {

                // j = numbers.length - j;
                j = j + 2 - numbers.length;
                System.out.println("else j = " + j);
                ballPass[i] = numbers[j];
                System.out.println("else num = " + numbers[j]);
            }
            i++;
        }

        answer = ballPass[ballPass.length-1];
        System.out.println(answer);

    }
}
