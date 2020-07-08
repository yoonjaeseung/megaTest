package basic.step04;

import java.util.Scanner;

/*
 * # 베스킨라빈스31
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.(게임 규칙 상 숫자를 3개까지 부를 수 있음)
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */
// 다시
public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p1 = 0;
		int p2 = 0;

		int br = 0;
		int turn = 0;

		boolean run = true;
		while (run) {
			if (turn % 2 == 0) {
				System.out.print("[p1]숫자 입력: ");
				p1 = sc.nextInt();
				br = br + p1;
				turn += 1;
			} else if (turn % 2 == 1) {
				System.out.print("[p2]숫자 입력: ");
				p2 = sc.nextInt();
				br = br + p2;
				turn += 1;
			}
			System.out.println("br = " + br);

			if (br >= 10) {
				if (turn % 2 == 0) {
					System.out.println("[p1]승리");
				} else if (turn % 2 == 1) {
					System.out.println("[p2]승리");
				}
				run = false;
				System.out.println("종료");
			}

		}

	}

}
