package programmers.level1;

import java.util.Arrays;

public class PicnicMat {
    public static void main(String[] args) {
        PicnicMat picnicMat = new PicnicMat();
        int[] mats = {5, 3, 2};
        String[][] park = {
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
        };
        int result = picnicMat.solution(mats, park);
        System.out.println("result:" + result);
    }

    public int solution(int[] mats, String[][] park) {
        int answer = 0;

        // 돗자리 크기 내림차순 정렬학기
        Arrays.sort(mats);
        // 가장 큰 돗자리부터 탐색해 빠르게 종료 (그리디 적용)
        for(int i = mats.length - 1; i >= 0; i--) {
            int mat_size = mats[i];
        }

        return answer;
    }
}
