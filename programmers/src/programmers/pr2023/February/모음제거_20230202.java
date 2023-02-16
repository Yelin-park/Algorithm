package programmers.pr2023.February;

public class 모음제거_20230202 {
    class Solution {
        public String solution(String my_string) {
            String answer = "";
            String[] vowel = {"a", "e", "i", "o", "u"};

            // replaceAll("[aeiou]", ""); 한줄 코딩으로도 가능
            for(int i = 0; i < my_string.length(); i++) {
                for(int j = 0; j < vowel.length; j++) {
                    if((my_string.charAt(i)+"").equals(vowel[j])) {
                        my_string = my_string.replace(vowel[j],  "");
                    }
                }
            }

            return answer = my_string;
        }
    }
}
