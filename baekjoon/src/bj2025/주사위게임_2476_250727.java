package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주사위게임_2476_250727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][7];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][Integer.parseInt(st.nextToken())]++;
            arr[i][Integer.parseInt(st.nextToken())]++;
            arr[i][Integer.parseInt(st.nextToken())]++;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int count = arr[i][1];
            int number = 1;
            for(int j = 2; j < arr[i].length; j++) {
                if(count < arr[i][j]) {
                    count = arr[i][j];
                    number = j;
                } else if(count == arr[i][j] && j > number) {
                    number = j;
                }
            }
            max = Math.max(max, cal(count, number));
        }
        System.out.println(max);
    }

    public static int cal(int count, int number) {
        int result = 0;
        if (count == 3) {
            result = 10000 + (number * 1000);
        } else if (count == 2) {
            result = 1000 + (number * 100);
        } else {
            result = number * 100;
        }
        return result;
    }
}