package basicArr.step02;

import java.util.Random;

/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */
//13분
public class Test01 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[5];

		int tot = 0;
		double avg = 0.0d;
		int passCnt = 0;

		// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		System.out.println("문제1>>>");
		for (int i = 0; i < 5; i++) {
			int score = ran.nextInt(100) + 1;
			arr[i] = score;

			tot = tot + score;

			if (arr[i] >= 60) {
				passCnt += 1;
			}
			System.out.print(arr[i] + " ");
		}

		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		System.out.println("\n문제2>>>");
		avg = tot / 5.0;
		System.out.println("총점: " + tot + " / 평균: " + avg);

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		System.out.println("문제3>>>");
		System.out.println("합격생: " + passCnt);
	}

}
