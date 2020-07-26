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
		System.out.println("총점 입력: ");
		int total = sc.nextInt();
		int idx2 = 0;
		int idx3 = 0;
		int check = 0;
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {

			if (scores[i] / 1000 >= 1) {
				idx2 = i + 1;
				idx3 = i + 2;
				sum = scores[idx2] + scores[idx3];
				if (total == sum) {
					System.out.println(sum + "==>" + scores[i]);
				} else {
					check = -1;
				}

			}
		}
		if (check == -1) {
			System.out.println("점수 오류");
		}

	}

}
