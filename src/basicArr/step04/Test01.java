package basicArr.step04;

import java.util.Scanner;
/*
 * [문제]복습
 * 
 */
//1,2번 20분
//답없음
public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = { 1001, 20, 1002, 45, 1003, 54 };
		int idx = 0;
		// 학번과 점수가 한쌍이다 1001:20 , 1002:45 , 1003:54

		// 문제1) 학번을 입력하면 점수 출력
		// 문제2) 점수를 입력하면 학번 출력

		boolean run = true;
		while (run) {
			System.out.println("==성적 확인==");
			System.out.println("검색[1.학번 2.점수 3.종료]");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.print("학번입력: ");
				int studentId = sc.nextInt();

				if (studentId / 1000 >= 1) {
					for (int i = 0; i < arr.length; i++) {
						if (studentId == arr[i]) {
							idx = i + 1;
							System.out.println("[학번]: " + arr[i] + "\t[점수]: " + arr[idx]);
						}
					}
					if (studentId != arr[idx]) {
						System.out.println("존재하지 않는 학번 입니다.");
					}
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}

			} else if (sel == 2) {
				System.out.print("점수입력: ");
				int score = sc.nextInt();

				if (score / 100 <= 0) {
					for (int i = 0; i < arr.length; i++) {
						if (score == arr[i]) {
							idx = i - 1;
							System.out.println("[학번]: " + arr[i] + "\t[점수]: " + arr[idx]);
						}
					}
					if (score != arr[idx]) {
						System.out.println("존재하지 않는 점수 입니다.");
					}
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			} else if (sel == 3) {
				run = false;
				System.out.println("종료");
			}

		}

		int scores[] = { 1001, 20, 43, 1002, 54, 2, 1003, 76, 6 };
		// 30분
		// 학번과 국어 수학 점수이다
		// 예) 1001 == (20 , 43)
		// 1002 == (54 , 2)
		// 1003 == (76 , 6)
		// 문제3) 점수의 합을 입력하면 번호 출력
		// 예) 63 ==> 1001
		// 예) 56 ==> 1002
		// 예) 82 ==> 1003
		System.out.println("문제3>>>");
		System.out.println("총점 입력: ");
		int total = sc.nextInt();
		int idx2 = 0;
		int idx3 = 0;
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] / 1000 >= 1) {
				idx2 = i + 1;
				idx3 = i + 2;
				sum = scores[idx2] + scores[idx3];
				if (total == sum) {
					System.out.println(sum + "==>" + scores[i]);
				}
			}
		}
		if (total != sum) {
			System.out.println("점수 오류");
		}

	}

}
