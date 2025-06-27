package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최소최대_10818_250627 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String[] list = br.readLine().split(" ");
        int min = Integer.parseInt(list[0]);
        int max = Integer.parseInt(list[0]);
        for (int i = 0; i < list.length; i++) {
            min = Math.min(min, Integer.parseInt(list[i]));
            max = Math.max(max, Integer.parseInt(list[i]));
        }

        System.out.println(min + " " + max);
    }
}
