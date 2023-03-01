package programmers.pr2023.Lv0.March;

import java.util.Arrays;

public class Lv0_다항식더하기_20230301 {
    public static void main(String[] args) {
        //String polynomial = "3x + 7 + x";
        String polynomial = "1 + 1";

        Solution s = new Solution();
        System.out.println(s.solution(polynomial));

    }

    static class Solution {
        public String solution(String polynomial) {
            String answer = "";

            polynomial = polynomial.replaceAll("\\s*", "");
            String[] tempArr = polynomial.split("\\+");
            System.out.println(Arrays.toString(tempArr));

            int x = 0;
            int no = 0;
            for(int i = 0; i < tempArr.length; i++) {
                if(tempArr[i].indexOf("x") > -1) {
                    if(tempArr[i].indexOf("x") == 0) {
                        x++;
                    } else {
                        x += Integer.parseInt(tempArr[i].substring(0, tempArr[i].indexOf("x")));
                    }

                } else {
                    no += Integer.parseInt(tempArr[i]);
                }
            }

            if(x == 0) {
                answer = no + "";
            }

            if(x > 1) {
                if(no > 0) answer = x + "x + " + no;
                if(no == 0) answer = x + "x";
            }

            if(x == 1) {
                if(no == 0) answer = "x";
                if(no > 0) answer = "x + " + no;
            }

            return answer;
        }
    }
}
