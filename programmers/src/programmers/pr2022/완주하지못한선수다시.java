package programmers.pr2022;

import java.util.HashMap;

public class 완주하지못한선수다시 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        Hash s = new Hash();
        System.out.println(s.solution(participant, completion));


    }

}

class Hash{
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            // map.put(completion[i], map.get(completion[i]) - 1);
            map.put(completion[i], map.getOrDefault(completion[i], 1) - 1);
        }

        for (String key: map.keySet()) {
            if(map.get(key) > 0){
                answer += key;
            }
        }

        return answer;
    }
}
