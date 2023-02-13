package programmers.pr2022;

public class 문자열내p와y의개수 {
    public static void main(String[] args) {

    }

    static boolean solution(String s) {
        boolean answer = false;

        s = s.toLowerCase();
        int pcnt = 0, ycnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.substring(i, i+1).equals("p")){
                pcnt++;
            } else if(s.substring(i, i+1).equals("y")){
               ycnt++;
            }
        }

        if(pcnt == ycnt){
            answer = true;
        }
        
        return answer;
    }
}
