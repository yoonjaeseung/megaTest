package basic.step02;
/*
 * ATM[2단계]
 * 로그인 ==> 1.입금 2.출금 3.조회
 * int cash = 20000; // 입금시 감소 , 출금시 증가
 * int balance = 30000; // 입금시 증가 , 출금시 감소
 * int account = 11111; // 로그인시 사용
 * int password = 1234; // 로그인시 사용
 * 
 */
import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// 1. 로그인 ==> 1.입금 2.출금 3.조회
		int cash = 20000; // 입금시 감소 , 출금시 증가
		int balance = 30000; // 입금시 증가 , 출금시 감소
		int account = 11111; // 로그인시 사용
		int password = 1234; // 로그인시 사용
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===MEGA ATM===");
		System.out.println("1.로그인 2.종료");
		int sel = sc.nextInt();
		if(sel == 1) {
			System.out.println("id 및 pw 입력: ");
			int acc = sc.nextInt();
			int pw = sc.nextInt();
			if(acc == account && pw == password) {
				
				System.out.println("안녕하세요 " + account+"님");
				System.out.println("1.입금  2.출금  3.조회");
				int sel2 = sc.nextInt();
				if(sel2 == 1) {
					System.out.println("입금할 금액: ");
					int inCach = sc.nextInt();
					
					
				}else if(sel2 == 2) {
					
				}else if(sel2 == 3) {
					
				}
				
			}else {
				System.out.println("존재하지 않는 계정");
			}
			

		}else {
			System.out.println("종료");
		}

	}

}
