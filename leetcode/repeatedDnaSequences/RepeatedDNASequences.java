package leetcode.repeatedDnaSequences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatedDNASequences {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> ans = solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        System.out.println(ans);
    }

    static class Solution {
        public List<String> findRepeatedDnaSequences(String s) {
            int length = 10;
            if (s.length() < length) {
                return new ArrayList<>();
            }

            HashSet<String> set = new HashSet<>();
            HashSet<String> ans = new HashSet<>();
            for (int i = 0; i + length <= s.length(); i++) {
                String sub = s.substring(i, i + length);
                if (!set.add(sub)) {
                    ans.add(sub);
                }
            }

            return new ArrayList<>(ans);
        }
    }
}
