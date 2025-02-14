package doIt.arrayAndList;

import java.util.Arrays;
import java.util.Scanner;

public class AverageCalculator {
    // 시간제한 2초
    // 난이도 브론즈 1
    // 백준 온라인 저지 1546번

    // 문제 분석
    // 최고 점수 기전으로 전체 점수를 다시 계산해야함으로 모든 점수를 입력받은 후에 최고점을 별도로 저장
    // 일일이 변환 점수를 구할 필요없이 한번에 변환한 점수의 평균 점수 구하기
    // 변환 점수의 평균을 구하는 식 (점수가 A, B, C인 경우)
    // (A / M * 100 + B / M * 100 + C / M * 100) / 3 = (A + B + C) * 100 / M / 3

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] test_num = new int[N];

        for(int i=0; i < N; i++) {
            test_num[i] = scanner.nextInt();
        }

        long sum = 0;
        long max = 0;

        for (int i = 0; i < N; i++) {
            if (test_num[i] > max) {
                max = test_num[i];
            }
            sum += test_num[i];
        }

        System.out.println(sum * 100.0 / max / N);


    }
}
