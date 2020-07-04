package basic.step01;

import java.util.Scanner;

/*
 * # 구구단 게임[1단계]
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */
//6분
public class Test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개 입력하세요:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int mul = num1 * num2;

		System.out.printf("[문제]\n%d * %d = ?", num1, num2);
		System.out.print("\n정답 입력:");
		int ans = sc.nextInt();

		if (ans == mul) {
			System.out.println("정답");
		}
		if (ans != mul) {
			System.out.println("땡");
		}

	}

}
