package programmers.pr2023;

public class 로그인성공_20230201 {
    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"},
                        {"yyoom", "1234"},
                        {"meosseugi", "1234"}};

        // 모두일치 login, 실패 fail, 아이디만 일치 wrong pw
        String answer = "fail";

        for (int i = 0; i < db.length; i++) {
            if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
                answer = "login";
            } else if(id_pw[0].equals(db[i][0])) {
                answer = "wrong pw";
            }
        }

        System.out.println(answer);
    }

    class Solution {
        public String solution(String[] id_pw, String[][] db) {
            String answer = "fail";

            for (int i = 0; i < db.length; i++) {
                if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
                    answer = "login";
                } else if(id_pw[0].equals(db[i][0])) {
                    answer = "wrong pw";
                }
            }

            return answer;
        }
    }
}
