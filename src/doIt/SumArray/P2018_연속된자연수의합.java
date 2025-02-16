package doIt.SumArray;

import java.util.Scanner;

public class P2018_연속된자연수의합 {
    // 시간제한 2초
    // 난이도 실버 5
    // 백준 온라인 저지 2018번

    // 문제분석
    // 시간 복잡도 분석으로 사용할 알고리즘의 범위 부터 줄여야함
    // 시간제한은 2초이나 N의 최대값은 10,000,000으로 매우 크게 잡혀 있음
    // 이럴 때 O(nlogn)의 시간 복잡도 알고리즘 사용시 제한 시간 초과 함
    // O(n)의 시간 복잡도 알고리즘 사용해야 함 => 투 포인터

    // 투 포인터 이동 원칙
    // * sum > N : sum = sum - start.index; start_index++;
    // * sum < N : end_index++; sum = sum + end_index;
    // * sum == N : end_index++; sum = sum + end_index;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1; // 자기자신 하나로 이루어진 경우의 수 미리저장 (예 } 1~15가 있고 15라면 15 자기자신)
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while (end_index != N) {
            if (sum == N) {
                count++;
                end_index++;
                sum += end_index;
            } else if (sum > N) {
                sum -= start_index;
                start_index++;
            } else {
                end_index++;
                sum += end_index;
            }

        }

        System.out.println(count);

    }
}
