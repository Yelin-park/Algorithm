package programmers.pr2023.February;

public class 배열회전시키기_20230207 {
    class Solution {
        public int[] solution(int[] numbers, String direction) {
            int[] answer = new int[numbers.length];

            if(direction.equals("right")) {
                for(int i = 0; i < numbers.length; i++){
                    if(i == numbers.length-1) {
                        answer[0] = numbers[numbers.length-1];
                    } else {
                        answer[i+1] = numbers[i];
                    }
                }

            } else if(direction.equals("left")){
                for(int i = numbers.length-1; i >= 0; i--){
                    if(i == 0) {
                        answer[answer.length-1] = numbers[0];
                    } else {
                        answer[i-1] = numbers[i];
                    }
                }

            }

            return answer;

            /*
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        if (direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
             */
        }
    }
}
