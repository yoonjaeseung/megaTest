package basic.step03;

import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3. 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4. 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 1번
 */
//20분
public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int x = ran.nextInt(10) + 1;
		int y = ran.nextInt(10) + 1;
		int op = ran.nextInt(4) + 1;

		if (op == 1) {
			int sum = x + y;
			System.out.println("[문제]: " + x + "?" + y + "=" + sum);
		} else if (op == 2) {
			int sub = x - y;
			System.out.println("[문제]: " + x + "?" + y + "=" + sub);
		} else if (op == 3) {
			int mul = x * y;
			System.out.println("[문제]: " + x + "?" + y + "=" + mul);
		} else if (op == 4) {
			int div = x % y;
			System.out.println("[문제]: " + x + "?" + y + "=" + div);
		}

		// 정답
		int z = 0;
		if (op == 1) {
			z = x + y;
		} else if (op == 2) {
			z = x - y;
		} else if (op == 3) {
			z = x * y;
		} else if (op == 4) {
			z = x % y;
		}

		System.out.println("[문제]: " + x + "?" + y + "=" + z);
		System.out.println("1) + 2) - 3) * 4) %");
		int ans = sc.nextInt();

		if (ans == op) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}

	}

}
