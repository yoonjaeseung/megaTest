package basic.step03;

//# 반복문 기본문제[1단계]
//4분
public class Test04 {

	public static void main(String[] args) {
		// 문제1) 1~10까지 반복해 5~9 출력
		// 정답1) 5, 6, 7, 8, 9
		System.out.println("문제1>>>");
		for (int i = 1; i <= 10; i++) {
			if (5 <= i && i <= 9) {
				System.out.print(i + " ");
			}
		}

		// 문제2) 10~1까지 반복해 6~3 거꾸로 출력
		// 정답2) 6, 5, 4, 3
		System.out.println("\n문제2>>>");
		for (int i = 10; i > 0; i--) {
			if (3 <= i && i <= 6) {
				System.out.print(i + " ");
			}
		}

		// 문제3) 1~10까지 반복해 짝수만 출력
		// 정답3) 2, 4, 6, 8, 10
		System.out.println("\n문제3>>>");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
