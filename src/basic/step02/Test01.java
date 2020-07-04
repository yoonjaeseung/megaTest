package basic.step02;

import java.util.Scanner;

/*
 * # 영수증 출력[1단계]
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */
//15분
public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;

		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");

		System.out.print("메뉴를 선택하세요:");
		int sel = sc.nextInt();

		System.out.print("현금 입력: ");
		int cash = sc.nextInt();

		if (sel == 1) {
			if (cash < price1) {
				System.out.println("현금이 부족합니다");
			} else {
				System.out.println("\n==영수증==");
				System.out.println("받은 금액: " + cash + "원");
				System.out.println("결제 금액: " + price1 + "원");
				System.out.println("잔돈: " + (cash - price1) + "원");
			}
		} else if (sel == 2) {
			if (cash < price2) {
				System.out.println("현금이 부족합니다");
			} else {
				System.out.println("\n==영수증==");
				System.out.println("받은 금액: " + cash + "원");
				System.out.println("결제 금액: " + price2 + "원");
				System.out.println("잔돈: " + (cash - price2) + "원");
			}
		} else if (sel == 3) {
			if (cash < price3) {
				System.out.println("현금이 부족합니다");
			} else {
				System.out.println("\n==영수증==");
				System.out.println("받은 금액: " + cash + "원");
				System.out.println("결제 금액: " + price3 + "원");
				System.out.println("잔돈: " + (cash - price3) + "원");
			}
		}

		// 정답
		// 방법1
		if (sel == 1) {
			if (cash >= price1) {
				cash = cash - price1;
				System.out.println("잔돈: " + cash + "원");
			}

			if (cash < price1) {
				System.out.println("현금이 부족합니다.");
			}
		}

		// 방법2
		int charge = 0;
		if (sel == 2) {
			charge = cash - price2;
		}

		if (charge >= 0) {
			System.out.println("잔돈: " + charge + "원");
		}

		if (charge < 0) {
			System.out.println("현금이 부족합니다.");

		}

	}

}
