package programmers.pr2022;

public class 부족한금액계산하기 {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        int sum = 0;
        int temp = 0;

        for (int i = 1; i <= count; i++) {
            temp = price * i;
            sum += temp;
        }

        System.out.println(sum);

        if(sum - money < 0){
            System.out.println(0);
        } else {
            System.out.println(sum - money);
        }


    }
}

class Solution23 {
    public long solution(int price, int money, int count) {
        long answer = 0;

        long sum = 0;
        long temp = 0;

        for (int i = 1; i <= count; i++) {
            temp = price * i;
            sum += temp;
        }

        if(sum - money < 0){
            return answer;
        } else {
            return answer = sum - money;
        }

    }
}