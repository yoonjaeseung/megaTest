package basicArr.step04;

import java.util.Random;
import java.util.Scanner;

/*
 * # 즉석복권
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 추가 문제) lotto 에 처음부터 값이 있는게 아니라 랜덤으로 7이나 0 을  넣은후 매번 다른 결과가 나오도록 만들어보세요
 *
 */
//질문: i<7-2 라고 하는 이유??? -> 잘못된 문제 6으로 변경. 이유는 [i+2] 에서 5+2가 7이므로!!
//	: 꽝을 넣기 위한 방법은? -> 아래 확인하기
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		// int[] lotto = { 0, 0, 7, 7, 7, 0, 0, 0 };
		// int[] lotto = { 7, 0, 7, 7, 0, 0, 0, 0 };
		// int[] lotto = {7, 0, 7, 7, 7, 0, 7, 0};

		boolean run = true;
		while (run) {
			System.out.println("1) 복권 결과확인");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {

			}
		}

	}
}
