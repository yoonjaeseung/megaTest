package basic.step03;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 */
//8분
public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int cnt = 0;

		int i = 0;
		while (i < 5) {
			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(9) + 1;
			int ans = x * y;

			System.out.print("[문제]: " + x + " X " + y + " = ");
			int myAns = sc.nextInt();

			if (myAns == ans) {
				System.out.println("정답");
				cnt += 1;
			} else {
				System.out.println("오답");
			}
			i++;
		}
		
		int score = cnt * 20;
		System.out.println("점수: " + score);
	}

}
