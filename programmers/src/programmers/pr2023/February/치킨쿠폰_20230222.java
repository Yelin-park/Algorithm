package programmers.pr2023.February;

public class 치킨쿠폰_20230222 {
    class Solution {
        public int solution(int chicken) {
            int answer = 0;
            int count = 0; // 치킨 서비스 갯수
            int coupon = chicken;

            while(coupon >= 10) {
                int tempCoupon = coupon % 10; // 남는 쿠폰수
                count += coupon / 10; // 치킨 서비스 갯수
                coupon = tempCoupon + coupon / 10;
            }

            return answer = count;
        }
    }
}