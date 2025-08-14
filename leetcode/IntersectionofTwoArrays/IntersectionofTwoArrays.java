package leetcode.IntersectionofTwoArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] intersection = intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    set.add(nums2[i]);
                }
            }
        }

        int[] answer = new int[set.size()];
        Iterator<Integer> iterator = set.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            answer[index++] = iterator.next();
        }
        return answer;
    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }

        int[] answer = new int[result.size()];
        int i = 0;
        for (int num : result) {
            answer[i++] = num;
        }
        return answer;
    }
}
