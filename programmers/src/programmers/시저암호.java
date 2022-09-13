package programmers;

public class 시저암호 {
    public static void main(String[] args) {
        // 97 a
        // 122 z
        // 65 A
        // 90 Z
        char str = 65;
        // System.out.println(Character.toString(str));

        String s = "a B z";

        String answer = "";

        char[] arr = s.toCharArray();
        int n = 4;
        char temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];

            if(temp == ' '){
                temp = ' ';
            } else {
                if('a' <= temp && temp + n > 'z'){
                    temp = (char)( temp + n - 26);
                } else if('Z' >= temp && temp + n > 'Z'){
                    temp = (char)( temp + n - 26);
                } else {
                    temp += n;
                }
            }

            answer += temp;
        }

        System.out.println(answer);

    }

    public static String solution(String s, int n) {
        String answer = "";

        char[] arr = s.toCharArray();

        char temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];

            if(temp == ' '){
                temp = ' ';
            } else {
                if('a' <= temp && temp + n > 'z'){
                    temp = (char)( temp + n - 26);
                } else if('Z' >= temp && temp + n > 'Z'){
                    temp = (char)( temp + n - 26);
                } else {
                    temp += n;
                }
            }

            answer += temp;
        }

        return answer;
    }

    public String solution2(String s, int n) {
        String answer = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLowerCase(ch)){ //소문자
                ch = (char)((ch-'a'+n)%26 + 'a');
            }
            else if(Character.isUpperCase(ch)){ //대문자
                ch = (char)((ch-'A'+n)%26 + 'A');
            }
            answer += ch;
        }
        return answer;
    }
}
