package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        // String[] strings = {"sun", "bed", "car"};
        // int n = 1;
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        S26 s = new S26();
        String[] answer = s.solution(strings, n);
        System.out.println(Arrays.toString(answer));
    }

}

class S26{
    // https://yzink.tistory.com/132
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        List<String> strArr = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            strArr.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(strArr);

        for (int i = 0; i < strArr.size(); i++) {
            answer[i] = strArr.get(i).substring(1, strArr.get(i).length());
        }

        return answer;
    }
}
