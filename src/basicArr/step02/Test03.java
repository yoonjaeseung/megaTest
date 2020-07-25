package basicArr.step02;

import java.util.Scanner;

/*
 * # 학생성적관리 프로그램[3단계] : 예외처리
 */
// 10분
public class Test03 {

	public static void main(String[] args) {

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// 문제) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.

		// start
		Scanner sc = new Scanner(System.in);

		System.out.print("학번 입력: ");
		int hakbun = sc.nextInt();

		int check = -1;
		for (int i = 0; i < 5; i++) {
			if (hakbuns[i] == hakbun) {
				check = i;
			}
		}

		if (check == -1) {
			System.out.println(hakbun + " 해당 학번은 존재하지 않습니다.");

		} else {
			System.out.println("성적: " + scores[check]);
		}

	}

}
