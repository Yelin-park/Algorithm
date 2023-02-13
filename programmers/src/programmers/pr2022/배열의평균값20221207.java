package programmers.pr2022;

public class 배열의평균값20221207 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 정답의 소수 부분이 .0과 .5만 입력 부분으로 주어짐


        Solution20221207_1 s = new Solution20221207_1();
        System.out.println(s.solution(numbers));

    }

}

class Solution20221207_1 {
    public double solution(int[] numbers) {
        double answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        answer = answer / numbers.length;

        String temp = answer + "";
        String lastNum = temp.substring(temp.length()-1, temp.length());

        if(lastNum.equals("0") || lastNum.equals("5")) {
            return answer;
        } else {
            return (int) answer;
        }

    }
}