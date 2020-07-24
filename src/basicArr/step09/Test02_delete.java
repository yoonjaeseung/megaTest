package basicArr.step09;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삭제
 */

public class Test02_delete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 10, 20, 30, 40, 50 };
		int cnt = 5;

		boolean run = true;
		while (run) {

			System.out.println("[2]삭제");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 2) {

				System.out.print("삭제할 값 입력 : ");
				int data = sc.nextInt();

			}

		}

	}

}
