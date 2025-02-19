package doIt.자료구조.스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class P1974_스택으로오름차순수열만들기 {
    // 시간제한 2초
    // 난이도 실버5
    // 백  준 올라인 저지 1974번

    // 수열의 개수 n (1 <= n <= 100,000)
    // 수열을 이루는 1이상 n이하의 정수가 1개씩 주어짐

    // [예제 입력 1]
    // 8  ---> 수열의 개수
    // 4 3 6 8 7 5 2 1
    // [예제 입력 2]
    // 5  ---> 수열의 개수
    // 5 1 2 5 3 4

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A[] = new int[N];
        
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        
        sc.close();

        StringBuffer bf = new StringBuffer();
        Stack<Integer> stack = new Stack<>();
        int top = 1;
        boolean result = true;

        for (int i = 0; i < A.length; i++) {   // N번 만큼 반복
            int su = A[i];
            if (su >= top) {                   // 현재 수열 값 >= 오름차순 자연수
                while (su >= top) {            // 값이 같아질 때까지
                    stack.push(top++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }  else {
                int n = stack.pop();
                if (n > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if (result) System.out.println(bf.toString());
    }
}
