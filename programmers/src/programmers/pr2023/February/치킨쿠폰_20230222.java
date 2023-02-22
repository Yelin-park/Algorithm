package programmers.pr2023.February;

public class 치킨쿠폰_20230222 {
    public static void main(String[] args) {
        System.out.println(1081 / 10); // 108
        System.out.println(1081 % 10); // 1
        System.out.println((1081 / 10) / 10); // 10
        System.out.println((1081 % 10) % 10); // 1
        System.out.println(((1081 / 10) / 10) / 10); // 1
        System.out.println(((1081 % 10) % 10) % 10); // 1
        System.out.println((((1081 / 10) / 10) / 10) / 10); // 0
        System.out.println((((1081 % 10) % 10) % 10) % 10); // 1

        System.out.println("======================================");
        System.out.println(100 / 10); // 10
        System.out.println(100 % 10); // 0
        System.out.println((100 / 10) / 10); // 1
        System.out.println((100 % 10) % 10); // 0
        System.out.println(((100 / 10) / 10) / 10); // 0
        System.out.println(((100 % 10) % 10) % 10); // 0


        Solution s = new Solution();
        int answer = s.solution(1081);
        System.out.println("answer = " + answer);

    }

    static class Solution {
        public int solution(int chicken) {
            int answer = 0;
            int count = 0;
            int coupon = chicken;

            while (coupon >= 10) {
                int leftCoupon = coupon % 10;
                count += coupon / 10;
                coupon = leftCoupon + coupon / 10;
            }

            return answer = count;

        }

    }
}