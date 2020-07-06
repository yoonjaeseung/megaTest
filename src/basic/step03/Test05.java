package basic.step03;

//# 반복문 기본문제[2단계]
//10분
public class Test05 {

	public static void main(String[] args) {
		int cnt = 0;

		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		System.out.println("문제1>>>");
		for (int i = 1; i <= 5; i++) {
			cnt = cnt + i;
		}
		System.out.println(cnt);

		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		System.out.println("\n문제2>>>");
		for (int i = 1; i <= 10; i++) {
			if (i >= 7 || i < 3) {
				System.out.print(i + " ");
			}
		}

		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		cnt = 0;
		System.out.println("\n문제3>>>");
		for (int i = 1; i <= 10; i++) {
			if (i >= 7 || i < 3) {
				cnt = cnt + i;
			}
		}
		System.out.println(cnt);

		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
		cnt = 0;
		System.out.println("\n문제4>>>");
		for (int i = 1; i <= 10; i++) {
			if (i >= 7 || i < 3) {
				cnt = cnt + 1;
			}
		}
		System.out.println(cnt);
		

	}
}
