package bj2025;

public class 셀프넘버_4673_250706 {
    public static void main(String[] args) {
        // 버전 1
        boolean[] selfNumberFlag = new boolean[10000]; // 기본 false
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= selfNumberFlag.length; i++) {
            if (i < 10) {
              selfNumberFlag[i+i] = true;
            } else if (i < 100) { // 2자리수
                int a = i / 10;
                int b = i % 10;
                selfNumberFlag[i + a + b] = true;
            } else if (i < 1000) { // 3자리수
                int a = i / 100;
                int b = (i / 10) % 10;
                int c = i % 10;
                selfNumberFlag[i + a + b + c] = true;
            } else if (i < 10000) { // 4자리수
                int a = i / 1000;
                int b = (i % 1000) / 100;
                int c = (i % 100) / 10;
                int d = i % 10;
                if (i + a + b + c + d < 10000) selfNumberFlag[i + a + b + c + d] = true;
            }
        }

        for (int j = 0; j < selfNumberFlag.length; j++) {
            if (!selfNumberFlag[j]) {
                sb.append(j).append("\n");
            }
        }

        System.out.println(sb);

        // 버전2
        /*boolean[] selfNumberFlag = new boolean[10000]; // 기본 false
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < selfNumberFlag.length; i++) {
            int n = cal(i);
            if (n < 10000) selfNumberFlag[n] = true;
        }

        for (int i = 0; i < selfNumberFlag.length; i++) {
            if (!selfNumberFlag[i]) sb.append(i).append("\n");
        }

        System.out.println(sb);
         */
    }

    public static int cal(int num) {
        int sum = num;

        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
