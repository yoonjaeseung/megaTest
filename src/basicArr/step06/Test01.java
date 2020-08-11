package basicArr.step06;

import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 */
//10분
public class Test01 {

	public static void main(String[] args) {
		int[] game = { 0, 0, 2, 0, 0, 0, 0 };

		int player = 0;
		for (int i = 0; i < 7; i++) {
			if (game[i] == 2) {
				player = i;
			}
		}

		// start
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			for (int i = 0; i < game.length; i++) {
				if (game[i] == 2) {
					System.out.print("옷 ");
				} else {
					System.out.print(game[i] + " ");
				}
			}
			System.out.println();

			System.out.println("왼(1) 오(2):");
			int sel = sc.nextInt();

			if (sel == 1) {
				if (player - 1 >= 0) {

					game[player - 1] = 2;
					game[player] = 0;
					player -= 1;

				} else {
					System.out.println("끝");
				}

			} else if (sel == 2) {
				if (player + 1 < 7) {
					
					game[player + 1] = 2;
					game[player] = 0;
					player += 1;
					
				} else {
					System.out.println("끝");
				}

			}

		}
	}

}
