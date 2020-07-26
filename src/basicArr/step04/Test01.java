package basicArr.step04;

import java.util.Scanner;

/*
 * [문제]복습
 * 
 */
//0545 52/ 52
public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = { 1001, 20, 1002, 45, 1003, 54 };
		// 학번과 점수가 한쌍이다 1001:20 , 1002:45 , 1003:54

		// 문제1) 학번을 입력하면 점수 출력
		// 문제2) 점수를 입력하면 학번 출력

		// start
		// System.out.println("문제1,2>>>");
		// boolean run = true;
		// while (run) {
		// System.out.println("==성적조회==");
		// System.out.println("1.학번 조회 / 2.점수 조회");
		// int sel = sc.nextInt();
		// if (sel == 1) {
		// System.out.print("학번 입력: ");
		// int hakbun = sc.nextInt();
		//
		// for (int i = 0; i < 6; i++) {
		// if (arr[i] == hakbun) {
		// System.out.println("점수: " + arr[i + 1]);
		// }
		// }
		// } else if (sel == 2) {
		// System.out.print("점수 입력: ");
		// int score = sc.nextInt();
		//
		// for (int i = 0; i < 6; i++) {
		// if (arr[i] == score) {
		// System.out.println("점수: " + arr[i - 1]);
		// }
		// }
		// }
		// }

		int scores[] = { 1001, 20, 43, 1002, 54, 2, 1003, 76, 6 };

		// 학번과 국어 수학 점수이다
		// 예) 1001 == (20 , 43)
		// 1002 == (54 , 2)
		// 1003 == (76 , 6)

		// 문제3) 점수의 합을 입력하면 번호 출력
		// 예) 63 ==> 1001
		// 예) 56 ==> 1002
		// 예) 82 ==> 1003
		int sum = 0;
		int idx = 0;
		// System.out.print("점수의 합 입력: ");
		// int ans = sc.nextInt();
		int[] temp = new int[6];
		for (int i = 0; i < 9; i++) {
			if (scores[i] / 1000 == 0) {
				temp[i] = scores[i];
				System.out.print(temp[i] + " ");
			}

			// if (ans == sum) {
			// idx = i - 1;
			// }

		}
		System.out.println();
		System.out.println("학번: " + scores[idx]);

	}

}
