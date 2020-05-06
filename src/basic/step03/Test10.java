package basic.step03;
/*
 * # ATM[2단계]
 * --모든 기능은 로그인 후 이용가능--
 * 
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * 3. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 4. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * 5. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 6. 조회
 * 7. 종료
 */

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;

		int log = -1; // -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)

		boolean run = true;
		while (run) {

			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
			} else if (sel == 2) {
			} else if (sel == 3) {
			} else if (sel == 4) {
			} else if (sel == 5) {
			} else if (sel == 6) {
			} else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}

}
