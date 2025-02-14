package level1;

public class BillFoldPattern {
    public static void main(String[] args) {
        BillFoldPattern billFoldPattern = new BillFoldPattern();

        int result1 = billFoldPattern.solution(new int[]{30, 15}, new int[]{26, 17});
        System.out.println("result1:" + result1);

        int result2 = billFoldPattern.solution(new int[]{50, 50}, new int[]{100, 241});
        System.out.println("result2:" + result2);

    }

    public int solution(int[] wallet, int[] bill) {
        // 지폐를 접은 횟수를 저장할 정수 변수 answer를 만들고 0을 저장
        int answer = 0;

        int min_bill = Math.min(bill[0], bill[1]);
        int min_wallet = Math.min(wallet[0], wallet[1]);
        int max_bill = Math.max(bill[0], bill[1]);
        int max_wallet = Math.max(wallet[0], wallet[1]);

        while (min_bill > min_wallet || max_bill > max_wallet) {
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }

            min_bill = Math.min(bill[0], bill[1]);
            max_bill = Math.max(bill[0], bill[1]);

            answer++;
        }
        return answer;
    }
}
