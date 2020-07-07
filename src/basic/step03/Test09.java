package basic.step03;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 */
// 8분
public class Test09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int ans = ran.nextInt(100) + 1;
		int score = 100;
		int cnt = 0;
		int run = 1;

		System.out.print("[문제]: " + ans);

		int i = 0;
		while (run == 1) {
			System.out.println("\n숫자를 입력하세요");
			int myAns = sc.nextInt();

			if (ans > myAns) {
				System.out.println("UP");
				cnt = cnt + 1;
			} else if (ans < myAns) {
				System.out.println("DOWN");
				cnt = cnt + 1;
			} else if (ans == myAns) {
				System.out.println("정답");
				run = 0;
			}
		}
	
		
		score = score - 5*cnt;
		System.out.print("점수: " + score);
	}

}
