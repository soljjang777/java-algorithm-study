package doIt.SumArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1806_부분합 {
    // 시간제한 0.5초
    // 난이도 골드4
    // 백준 온라인 저지 1806번

    // 10,000 이하의 자연수로 이루어진 길이 N짜리 수열
    // 이 수열에서 연속된 수들의 부분합 중에 그 합이 S 이상이 되는 것 중, 가장 짧은 것의 길이를 구하기

    // (10 <= N < 10,000)
    // (0 < S <= 100,000,000)

    // 입력값
    // 10 15
    // 5 1 3 5 10 7 4 9 2 8
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min_len = Integer.MAX_VALUE;
        int right = 0;
        int left = 0;
        int sum = 0;


        while (right <= N) {  // right가 배열 끝까지 가도 left 체크하도록 수정
            if (sum < S) {
                if (right == N) break; // 배열 끝까지 갔으면 종료
                sum += arr[right];
                right++;
            } else {
                min_len = Math.min(min_len, (right - left));
                sum -= arr[left];
                left++;
            }
        }

        System.out.println(min_len == Integer.MAX_VALUE ? 0 : min_len);


    }
}
