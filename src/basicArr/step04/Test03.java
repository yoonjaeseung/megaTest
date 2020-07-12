package basicArr.step04;

import java.util.Scanner;

/*
 * # 즉석복권
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 */

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lotto = { 0, 0, 7, 7, 7, 0, 0, 0 };
		// int[] lotto = {7, 0, 7, 7, 0, 0, 0, 0};
		// int[] lotto = {7, 0, 7, 7, 7, 0, 7, 0};

		boolean run = true;
		while (run) {
			System.out.println("1) 복권 결과확인");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {

			}
		}

	}
}
