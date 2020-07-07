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
//28
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

			int money = 0;
			if (sel == 1) {
				if (log == -1) {
					System.out.println("ID입력: ");
					int id = sc.nextInt();
					System.out.println("PW입력: ");
					int pw = sc.nextInt();

					if (id == dbAcc1 && pw == dbPw1) {
						System.out.println("환영합니다" + dbAcc1 + "님");
						log = 1;

					} else if (id == dbAcc2 && pw == dbPw2) {
						System.out.println("환영합니다" + dbAcc2 + "님");
						log = 2;
					} else {
						System.out.println("아이디 또는 패스워드가 일치하지 않습니다.");
					}
				} else {
					System.out.println("이미 로그인 하셨습니다.");
				}

			} else if (sel == 2) {
				if (log != -1) {
					log = -1;
					System.out.println("로그아웃 되셨습니다.");
				} else {
					System.out.println("로그인을 해주세요.");
				}

			} else if (sel == 3) {
				if (log != -1) {
					if (log == 1) {
						System.out.println("입금할 금액 입력: ");
						int deposit = sc.nextInt();
						dbMoney1 += deposit;
					} else if (log == 2) {
						System.out.println("입금할 금액 입력: ");
						int deposit = sc.nextInt();
						dbMoney2 += deposit;
					}
					System.out.println("입금 완료");

				} else {
					System.out.println("로그인을 해주세요");
				}

			} else if (sel == 4) {
				if (log != -1) {
					if (log == 1) {
						System.out.println("출금할 금액 입력: ");
						int withdraw = sc.nextInt();
						if (dbMoney1 >= withdraw) {
							dbMoney1 -= withdraw;
						} else if (dbAcc1 < withdraw) {
							System.out.println("금액이 부족합니다");
						}
					} else if (log == 2) {
						System.out.println("출금할 금액 입력: ");
						int withdraw = sc.nextInt();
						if (dbMoney2 >= withdraw) {
							dbMoney2 -= withdraw;
						} else if (dbAcc2 < withdraw) {
							System.out.println("금액이 부족합니다");
						}
					}
				} else {
					System.out.println("로그인을 해주세요");
				}

			} else if (sel == 5) {

				if (log != -1) {
					System.out.println("이체하실 계좌번호 입력: ");
					int sendAcc = sc.nextInt();

					if (log == 1) {
						if (dbAcc2 == sendAcc) {
							System.out.print("이체하실 금액 입력:");
							int sendMoney = sc.nextInt();
							if (dbMoney1 >= sendMoney) {
								dbMoney1 -= sendMoney;
								dbMoney2 += sendMoney;
								System.out.println("이체 완료");

							} else if (dbMoney1 < sendMoney) {
								System.out.println("금액이 부족합니다.");
							}
						} else if (dbAcc2 != sendAcc) {
							System.out.println("잘못된 계좌번호 입니다");
						}

					} else if (log == 2) {
						if (dbAcc1 == sendAcc) {
							System.out.print("이체하실 금액 입력:");
							int sendMoney = sc.nextInt();
							if (dbMoney2 >= sendMoney) {
								dbMoney2 -= sendMoney;
								dbMoney1 += sendMoney;
								System.out.println("이체 완료");

							} else if (dbMoney2 < sendMoney) {
								System.out.println("금액이 부족합니다.");
							}
						} else if (dbAcc1 != sendAcc) {
							System.out.println("잘못된 계좌번호 입니다");
						}
					}
				} else {
					System.out.println("로그인 후 이용가능");
				}

			} else if (sel == 6) {
				if (log != -1) {
					System.out.println(dbAcc1 + "님 잔액: " + dbMoney1);
					System.out.println(dbAcc2 + "님 잔액: " + dbMoney2);
				} else {
					System.out.println("로그인 후 이용가능");
				}

			} else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}

		}

	}

}
