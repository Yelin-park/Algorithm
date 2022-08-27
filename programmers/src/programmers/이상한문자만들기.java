package programmers;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        String s = "tRy hello wOrld";
        System.out.println(solution(s));

    }

    public static String solution(String s) {
        String answer = "";

        String[] arr = s.split(" ", -1);


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            String temp = "";
            for (int j = 0; j < arr[i].length(); j++) {
                if(j == 0 || j % 2 == 0){
                    temp += arr[i].substring(j, j + 1).toUpperCase();
                } else{
                    temp += arr[i].substring(j, j + 1).toLowerCase();
                }
            }
            answer += temp;
            answer += " ";
        }

        answer = answer.substring(0, answer.length()-1);

        return answer;
    }
}
