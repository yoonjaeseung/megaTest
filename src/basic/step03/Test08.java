package basic.step03;

import java.util.Scanner;

/*
 * # 반복문 종료(-100)
 * 1. 무한 반복을 하면서 숫자를 입력받는다.
 * 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
 */
//3분
public class Test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean check = true;

		int i = 0;
		while (check) {
			System.out.print("숫자 입력: ");
			int num = sc.nextInt();

			if (num == -100) {
				check = false;
			}
		}
		System.out.println("종료");

		// 정답
		int run = 1;
		while (run == 1) {
			System.out.println("숫자입력[exit:-100]: ");
			int num = sc.nextInt();

			if (num == -100) {
				System.out.println("종료");
				run = 0;
			}
		}
	}

}
