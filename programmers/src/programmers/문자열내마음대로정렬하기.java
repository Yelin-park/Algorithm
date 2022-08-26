package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        // String[] strings = {"sun", "bed", "car"};
        // int n = 1;
        // String[] strings = {"abce", "abcd", "cdc"};
        String[] strings = {"zxc", "abc", "bbc", "fsc", "adcpo"};
        int n = 2;

        S26 s = new S26();
        String[] answer = s.solution(strings, n);
        System.out.println(Arrays.toString(answer));
    }
}

/*class S26{
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
}*/

class S26 {
    /*public String[] solution(String[] strings, int n) {

        String[] answer = new String[strings.length];
        ArrayList <String> list = new ArrayList<>();
        boolean chk;
        list.add(strings[0]);

        for(int i = 1; i < strings.length; i++){
            chk = true;
            for(int j = 0; j < i; j++){
                if( strings[i].substring(n, n+1).compareTo(strings[j].substring(n, n+1)) <= 0 ){
                    if( strings[i].substring(n, n+1).equals(strings[j].substring(n, n+1)) ){
                        list.add(strings[i].compareTo(strings[j]) < 0? j : j+1,strings[i]);
                        System.out.println(list);
                    }else{
                        list.add(j, strings[i]);
                    }
                    chk = false;
                    break;
                }
            }
            if( chk ){
                list.add(strings[i]);
                System.out.println(list);
            }
        }

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }*/

    public String[] solution(String[] strings, int n) {

        String[] answer = new String[strings.length];
        ArrayList <String> list = new ArrayList<>();
        boolean chk;
        list.add(strings[0]);

        for(int i = 1; i < strings.length; i++){
            chk = true;
            for(int j = 0; j < i; j++){
                if( strings[i].substring(n, n+1).compareTo(strings[j].substring(n, n+1)) < 0 ){
                    list.add(j, strings[i]);
                    chk = false;
                    break;
                } else if( strings[i].substring(n, n+1).equals(strings[j].substring(n, n+1)) ){
                    if( strings[i].compareTo(strings[j]) > 0 ) continue;
                    else{
                        list.add(j, strings[i]);
                        chk = false;
                        break;
                    }
                }
            }

            if( chk ){
                list.add(strings[i]);
            }

        }

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

}
