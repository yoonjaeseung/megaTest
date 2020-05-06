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

	}

}
