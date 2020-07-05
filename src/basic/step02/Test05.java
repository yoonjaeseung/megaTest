package basic.step02;

import java.util.Scanner;
import java.util.Random;
/*
 * # 홀짝 게임
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 */
// 8분

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int rNum = ran.nextInt(100) + 1;
		System.out.print("랜덤 숫자: " + rNum);

		System.out.println("\n1.홀수");
		System.out.println("2.짝수");

		System.out.print("번호를 선택하세요 : ");
		int choice = sc.nextInt();

		if (rNum % 2 == 1 && choice == 1) {
			System.out.println("정답:[홀수]");
		} else if (rNum % 2 == 0 && choice == 2) {
			System.out.println("정답:[짝수]");
		} else {
			System.out.println("땡");
		}

		// 정답
		if (choice == 1) {
			if (rNum % 2 == 1) {
				System.out.println("정답!");
			}

			if (rNum % 2 == 0) {
				System.out.println("오답!");
			}
		}

		if (choice == 2) {
			if (rNum % 2 == 1) {
				System.out.println("오답!");
			}

			if (rNum % 2 == 0) {
				System.out.println("정답!");
			}
		}

	}

}
