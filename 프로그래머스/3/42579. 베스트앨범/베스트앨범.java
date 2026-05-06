import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer>answer = new ArrayList<>();
        //장르별 총 재생횟수 <장르, 재생횟수>
        Map<String, Integer> genreTotal = new HashMap<>();
        //장르별 고유번호 및 재생횟수
        Map<String, List<Integer>> genreSong = new HashMap<>();
        
        //Map.put
        for(int i = 0; i < genres.length; i++){
            genreTotal.put(genres[i], genreTotal.getOrDefault(genres[i], 0) + plays[i]);
            //만약 없다면 넣어라
            genreSong.putIfAbsent(genres[i], new ArrayList<>());
            genreSong.get(genres[i]).add(i);
        }
        
        // 3. 총 재생횟수가 많은 순서대로 장르 이름 정렬
        List<String> sortedGenres = new ArrayList<>(genreTotal.keySet());
        sortedGenres.sort((o1, o2) -> genreTotal.get(o2).compareTo(genreTotal.get(o1)));

        // 4. 정렬된 각 장르를 순회하며 곡 추출
        for (String genre : sortedGenres) {
            List<Integer> songs = genreSong.get(genre);

            // 장르 내 곡 정렬: 1순위 재생수(내림차순), 2순위 고유번호(오름차순)
            songs.sort((a, b) -> {
                if (plays[a] == plays[b]) return a - b;
                return plays[b] - plays[a];
            });

            // 최대 2곡까지 결과 리스트에 추가
            answer.add(songs.get(0));
            if (songs.size() > 1) {
                answer.add(songs.get(1));
            }
        }

        // 5. 결과를 int 배열로 변환하여 반환
        return answer.stream().mapToInt(i -> i).toArray();
    }
}