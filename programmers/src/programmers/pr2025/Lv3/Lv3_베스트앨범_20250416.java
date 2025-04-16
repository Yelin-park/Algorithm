package programmers.pr2025.Lv3;

import java.util.*;

/**
 *
 * 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
 * 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
 * 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
 *
 * 제한사항
 * genres[i]는 고유번호가 i인 노래의 장르입니다.
 * plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
 * genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
 * 장르 종류는 100개 미만입니다.
 * 장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
 * 모든 장르는 재생된 횟수가 다릅니다.
 */
public class Lv3_베스트앨범_20250416 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 500, 2500};

        Solution solution = new Solution();
        int[] answer = solution.solution(genres, plays);
        System.out.println("answer = " + Arrays.toString(answer));
    }

    static class Solution {
        public int[] solution(String[] genres, int[] plays) {
            Map<String, Integer> genreTotalPlays = new HashMap<>(); // 장르별 전체 재생 횟수 저장
            Map<String, List<int[]>> genreToSongs = new HashMap<>(); // 노래 고유 번호와 해당 노래의 재생 횟수 저장

            // 장르별 총 재생 수 및 노래 고유 번호와 해당 노래의 재생 횟수 저장
            for (int i = 0; i < genres.length; i++) {
                String genre = genres[i];
                int play = plays[i];

                genreTotalPlays.put(genre, genreTotalPlays.getOrDefault(genre, 0) + play);

                genreToSongs.putIfAbsent(genre, new ArrayList<>());
                genreToSongs.get(genre).add(new int[]{i, play});
            }

            // 장르별 총 재생 수로 정렬하기
            ArrayList<String> sortedGenres = new ArrayList<>(genreTotalPlays.keySet());
            sortedGenres.sort((a, b) -> genreTotalPlays.get(b) - genreTotalPlays.get(a));

            ArrayList<Integer> result = new ArrayList<>();

            // 각 장르별로 재생 수, 고유번호 기준으로 정렬 후 최대 2개까지 수록하기
            for (String genre : sortedGenres) {
                List<int[]> songs = genreToSongs.get(genre);
                songs.sort((a, b) -> {
                    if (b[1] != a[1]) return b[1] - a[1];
                    return a[0] - b[0];
                });

                // 정렬 후 장르 별 노래를 최대 2개까지 수록하기
                for (int i = 0; i < Math.min(2, songs.size()); i++) {
                    result.add(songs.get(i)[0]);
                }
            }

            return result.stream().mapToInt(i -> i).toArray();
        }
    }
}
