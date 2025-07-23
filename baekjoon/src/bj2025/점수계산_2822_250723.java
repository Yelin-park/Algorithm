package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 점수계산_2822_250723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 8; i++) {
            map.put(i+1, Integer.parseInt(br.readLine()));
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((m1, m2) -> m2.getValue().compareTo(m1.getValue()));
        list = list.subList(0, 5);
        list.sort(Comparator.comparing(Map.Entry::getKey));
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getValue();
            sb.append(list.get(i).getKey()).append(" ");
        }
        sb.insert(0, sum + "\n");
        System.out.println(sb);
    }
}
