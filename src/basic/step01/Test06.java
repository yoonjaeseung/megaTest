package basic.step01;

import java.util.Scanner;

/*
 * # 로그인[1단계]
 * 1. Id와 Pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 * 예) 로그인 성공 or 로그인 실패
 */
//2분
public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dbId = 1234;
		int dbPw = 1111;

		System.out.println("ID 와  PW를 입력하세요:");
		int id = sc.nextInt();
		int pw = sc.nextInt();

		if (id == dbId && pw == dbPw) {
			System.out.println("로그인 성공");
		}
		if (id != dbId || pw != dbPw) {
			System.out.println("로그인 실패");
		}

	}

}
