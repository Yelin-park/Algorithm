package leetcode.CheckIfNuberHasEqualDigitCountAndDigitValue;

public class CheckIfNumber_2283 {
    public static void main(String[] args) {
        boolean b = digitCount("1210");
        System.out.println(b);
    }

    public static boolean digitCount(String num) {
        int[] counts = new int[10];
        int[] digits = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            digits[i] = num.charAt(i) - '0';
            counts[num.charAt(i) - '0']++;
        }

        boolean flag = true;
        for (int i = 0; i < num.length(); i++) {
            if (digits[i] != counts[i]) {
                flag = false;
                return flag;
            }
        }
        return flag;
    }

    public static boolean digitCount_v2(String num) {
        int[] counts = new int[10];
        for (int i = 0; i < num.length(); i++) {
            counts[num.charAt(i) - '0']++;
        }

        for (int i = 0; i < num.length(); i++) {
            int expectedCount = num.charAt(i) - '0';
            if (expectedCount != counts[i]) {
                return false;
            }
        }
        return true;
    }
}
