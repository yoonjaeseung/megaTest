package basicArr.step10.copy2;

import java.util.Scanner;

/*
 * # ATM[3단계]
 * 1. 가입
 * . 계좌번호와 비밀번호를 입력받아 가입
 * . 계좌번호 중복검사
 * 2. 탈퇴
 * . 계좌번호를 입력받아 탈퇴
 */

public class Test01_atm3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] accs = { 1001, 1002, 0, 0, 0 };
		int[] pws = { 1111, 2222, 0, 0, 0 };

		int cnt = 2;

		boolean run = true;
		while (run) {

			System.out.println("1.가입");
			System.out.println("2.탈퇴");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
			} else if (sel == 2) {
			}

		}

	}

}
