package programmers;

import java.util.ArrayList;

public class N의배수고르기_20230204 {
    public static void main(String[] args) {
        int[] numlist ={4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = 3;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0) {
                list.add(numlist[i]);
            }
        }

        // 리스트를 스트림으로 변환 후, map을 이용하여 intStream을 가져오고 그 후에 toArray()를 통해 배열로 만드는 방법
        int[] answer = list.stream()
                            .mapToInt(i -> i)
                            .toArray();

        // return Arrays.stream(numList).filter(value -> value % n == 0).toArray();

    }
}
