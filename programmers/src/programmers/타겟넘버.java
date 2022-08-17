package programmers;

import java.util.Stack;

public class 타겟넘버 {

    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;

        // 경우의 수를 찾아야해서 DFS(깊이우선탐색)

    }

}

class Solution18 {

    int answer;

    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;

        // dfs(0,0);
        dfs(0,numbers, target, 0);

        return answer;
    }

    void dfs(int depth, int[] numbers, int target, int sum) {
        // 탈출 조건
        if(depth == numbers.length) { // numbers 배열의 크기만큼 돌았다면
            if(sum == target) answer++; // 계산한 sum 값이 target과 같다면 answer 증가
            return; // 탈출
        }

        // 수행조건
        // 순서대로 계산을 해야되기 때문에 depth를 1씩 증가하고 +,-를 계산하야 하기 때문에 sum +- numbers의 해당 레벨의 값을 계산
        dfs(depth+1, numbers, target, sum+numbers[depth]);
        dfs(depth+1, numbers, target, sum-numbers[depth]);
    }

    public static int depth = 0;
    public static int sum = 0;

    int[] numbers;
    int target;

    void dfs(int depth, int sum) {
        // 탈출 조건
        if(depth == numbers.length) { // numbers 배열의 크기만큼 돌았다면
            if(sum == target) answer++; // 계산한 sum 값이 target과 같다면 answer 증가
            return; // 탈출
        }

        // 수행조건
        // 순서대로 계산을 해야되기 때문에 depth를 1씩 증가하고 +,-를 계산하야 하기 때문에 sum +- numbers의 해당 레벨의 값을 계산
        dfs(depth+1, sum + numbers[depth]); //
        dfs(depth+1, sum - numbers[depth]);
    }
}
