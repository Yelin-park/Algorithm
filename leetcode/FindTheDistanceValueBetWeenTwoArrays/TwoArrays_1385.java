package leetcode.FindTheDistanceValueBetWeenTwoArrays;

public class TwoArrays_1385 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //int[] arr1 = {4, 5, 8};
        int[] arr1 = {1, 4, 2, 3};
        //int[] arr2 = {10,9,1,8};
        int[] arr2 = {-4, -3, 6, 10, 20, 30};
        int d = 3;
        int result = solution.findTheDistanceValue(arr1, arr2, d);
        System.out.println(result);
    }
}

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            if (!flag) {
                count++;
            }
        }
        return count;
    }
}
