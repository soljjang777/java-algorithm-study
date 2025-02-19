package doIt.자료구조.구간의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기1 {
    // 시간제한 0.5초
    // 난이도 실버 4
    // 백준 온라인 저지 11659번
    public static void main(String[] args) throws IOException {
        // 10만개의 데이터가 들어올 수 있음으로 받는 데이터가 많을때는 BufferedReader 쓰는게 좋음 (빠름)
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // 한줄데이터가 길때는 int형으로 어려움 그래서 stringTokenizer
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        long[] s = new long[suNo + 1]; // index 0 무시하고 사용하려고 +1 함
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 1; i <= suNo; i++) {
            s[i] = s[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(s[j] - s[i - 1]);
        }
    }
}
