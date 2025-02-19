package doIt.자료구조.배열과리스트;

import java.util.Scanner;

public class P1546_숫자의합구하기 {
    // 시간제한 1초
    // 난이도 브론즈 2
    // 백준 온라인 저지 v번

    // 입력
    // 1번째 줄에 숫자의 개수 N(1 <= N <= 100), 2번째 줄에 숫자 N개가 공백 없이 주어진다.

    // 출력
    // 입력으로 주어진 숫자 N개의 합을 출력한다

    // N의 범위가 1부터 100까지 이므로 값을 int형(-2,147,483,648 ~ 2,147,483,647), long형(-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)과 같은 수자로 담을 수 없음
    // 그래서 String형으로 입력값을 받은 후 이를 문자 배열로 반환해서 문자 배엵값을 순서대로 읽으면서 숫자형으로 더해야됨
    // 문자열을 숫자형으로 변경 하기 위해서 아스키코드 이용(같은 의미의 문자와 숫자의 코드 값 차이는 48 / 예} '1'은 아스키코드 값이 49이므로 문자 '1'을 숫자로 변환하려면 '1' - 48 = 1 or '1' - '0' = 1)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        int sum = 0;

        for(char cNum : sNum.toCharArray()) {
//            sum += (cNum - 48);
            sum += (cNum - '0');
        }

        System.out.println(sum);
    }
}
