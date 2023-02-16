package programmers.pr2023.February;

public class 숨어있는숫자의덧셈_20230201 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        int answer = 0;
        String[] numArr = {"1","2","3","4","5","6","7","8","9"};

        for(int i = 0; i < numArr.length; i++){
            for(int j = 0; j < my_string.length(); j++){
                if(my_string.substring(j, j+1).equals(numArr[i])) {
                    answer += Integer.parseInt(numArr[i]);
                }
            }
        }

        System.out.println(answer);

        // return answer;
    }
}
