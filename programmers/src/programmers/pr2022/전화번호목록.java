package programmers.pr2022;

import java.util.HashMap;

public class 전화번호목록 {

    public static void main(String[] args) {

        String[] phone_book = {"119", "97674223", "1195524421"};

        전화번호목록 s = new 전화번호목록();

        System.out.println(s.solution(phone_book));

    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length-1; i++) {
            map.put(phone_book[i], 0);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                System.out.println(phone_book[i].substring(0, j));
                if(map.containsKey(phone_book[i].substring(0, j))) return answer = false;
            }
        }

        return answer;
    }



}
