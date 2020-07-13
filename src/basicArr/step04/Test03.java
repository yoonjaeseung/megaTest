package basicArr.step04;

import java.util.Random;
import java.util.Scanner;

/*
 * # 즉석복권
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 추가 문제) lotto 에 처음부터 값이 있는게 아니라 랜덤으로 7이나 0 을  넣은후 매번 다른 결과가 나오도록 만들어보세요
 *
 */
//질문: i<7-2 라고 하는 이유???
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		// int[] lotto = { 0, 0, 7, 7, 7, 0, 0, 0 };
		// int[] lotto = { 7, 0, 7, 7, 0, 0, 0, 0 };
		// int[] lotto = {7, 0, 7, 7, 7, 0, 7, 0};

		int[] lotto = new int[8];

		int cnt = 0;
		int cnt2 = 0;
		int idx = 0;

		int run = 0;
		while (run <= 3) {

			System.out.print("치트키 ==>[ ");
			for (int i = 0; i < 8; i++) {
				int num = ran.nextInt(2);
				if (num == 1) {
					lotto[i] = 7;
				} else if (cnt == 0) {
					lotto[i] = 0;
				}
				System.out.print(lotto[i] + " ");
			}
			System.out.println("]");

			System.out.println("1) 복권 결과확인 2) 종료");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				for (int i = 0; i < 7 - 2; i++) {
					if (lotto[i] == 7 && lotto[i + 1] == 7 && lotto[i + 2] == 7) {
						System.out.println("당첨");
						cnt += 1;
						i = 7 - 2;
						idx = i;
					}
				}

			} else if (sel == 2) {
				run = 3;
				System.out.println("종료");


			} else {
				System.out.println("잘못눌렀습니다");
			}
			run++;
		}
		
		System.out.println("당첨 복권: " + cnt + "개");

	}
}
