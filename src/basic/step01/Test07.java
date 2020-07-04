package basic.step01;

import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */
//7분
public class Test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dbId = 0;
		int dbPw = 0;

		System.out.println("==회원가입==");
		System.out.print("사용하실 id 입력:");
		dbId = sc.nextInt();
		System.out.print("사용하실 pw 입력:");
		dbPw = sc.nextInt();
		System.out.println("회원가입 완료!!\n");

		System.out.println("==로그인==");
		System.out.print("id를 입력하세요:");
		int myId = sc.nextInt();
		System.out.print("pw를 입력하세요:");
		int myPw = sc.nextInt();

		if (dbId == myId && dbPw == myPw) {
			System.out.println("로그인 성공");
		}

		if (dbId != myId || dbPw != myPw) {
			System.out.println("로그인 실패");
		}
	}

}
