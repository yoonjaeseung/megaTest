package basic.step02;

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */
//6분
public class Test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int myAcc = 1234;
		int myMoney = 8700;

		int yourAcc = 4321;
		int yourMoney = 12000;

		System.out.println("이체할 계좌번호 입력: ");
		int sendAcc = sc.nextInt();
		if (sendAcc == yourAcc) {
			System.out.println("이체할 금액 입력: ");
			int sendMoney = sc.nextInt();

			if (sendMoney <= myMoney) {
				myMoney = myMoney - sendMoney;
				yourMoney = yourMoney + sendMoney;
				
				System.out.println("이체가능");

			} else if (sendMoney > myMoney) {
				System.out.println("이체불가");
			}
		} else {
			System.out.println("없는 계좌");
		}

		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");

	}
}
