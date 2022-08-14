package programmers;

public class 하샤드수 {

    public static void main(String[] args) {
        int x = 18;

        String str = x + "";

        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            // cnt += Integer.parseInt(String.valueOf(str.charAt(i)));
            cnt += str.charAt(i) - 48;
        }

        System.out.println(cnt);
    }

    public boolean solution(int x) {
        boolean answer = true;

        String str = x + "";

        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            cnt += str.charAt(i) - 48;
        }

        if( x % cnt != 0) return answer = false;

        return answer;
    }

}
