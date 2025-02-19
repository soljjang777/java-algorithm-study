package doIt.자료구조.구간의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11660_구간합구하기2 {
    // 시간제한 1초
    // 난이도 실버 1
    // 백준 온라인 저지 11660번

    // 표의 크기 N  (1 <= N <= 1024)
    // 질의개수 M   (1 <= M <= 100,000)  => 입력이 많은 건? 한번 정답판을 만들어놓고 질의가 오면 바로 답을 출력하는형태

    // 예제 입력
    // 4 3      # 2차원 배열의 크기, 구간의 합 질의의 개수
    // 1 2 3 4  # 원본 배열 1번째 줄
    // 2 3 4 5  # 원본 배열 2번째 줄
    // 3 4 5 6  # 원본 배열 3번째 줄
    // 4 5 6 7  # 원본 배열 4번째 줄
    // 2 2 3 4  # 구간 합(X1, Y1) (X2, Y2) 1번째 질의
    // 3 4 3 4  # 구간 합(X1, Y1) (X2, Y2) 2번째 질의
    // 1 1 4 4  # 구간 합(X1, Y1) (X2, Y2) 3번째 질의

    // * 2차원 구간 합 배열 D[X][Y] 정의
    // D[X][Y] = 원본 배열의 (0,0)부터 (X,Y)까지의 사각형 영역 안에 있는 수의 합
    // * 질의 X1, Y1, X2, Y2에 대한 답을 구간 합으로 구하는 방법
    // D[X2][Y2] - D[X1-1][Y2] - D[X2][Y1-1] + D[X1-1][Y1-1]
    // => 2 2 3 4 입력값 일 경우
    // D[3][4] - D[1][4]- D[3][1] + D[1][1] = 27
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] sum_arr = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                sum_arr[i][j] = sum_arr[i][j-1] + sum_arr[i-1][j] - sum_arr[i-1][j-1] + Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int result = sum_arr[x2][y2] - sum_arr[x1 - 1][y2] - sum_arr[x2][y1 - 1] + sum_arr[x1 - 1][y1 - 1];
            sb.append(result).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
