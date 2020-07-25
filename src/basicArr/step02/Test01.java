package basicArr.step02;

import java.util.Random;

/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */

//10분
public class Test01 {

	public static void main(String[] args) {

		int[] arr = new int[5];

		// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47

		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명

		// start
		Random ran = new Random();

		int total = 0;
		int cnt = 0;
		System.out.println("문제1>>>");
		for (int i = 0; i < 5; i++) {
			int num = ran.nextInt(100) + 1;
			arr[i] = num;
			System.out.print(arr[i] + " ");
			total += num;

			if (arr[i] >= 60) {
				cnt++;
			}
		}
		System.out.println();

		System.out.println("문제2>>>");
		double avg = total / 5.0;
		System.out.println("총점: " + total + " / " + "평균: " + avg);

		System.out.println("문제3>>>");
		System.out.println("합격생: " + cnt + "명");

	}

}
