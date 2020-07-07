package basic.step04;

/*
 * # 369게임[2단계]
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ... 31 32 짝짝 ...
 */
//15분
public class Test02 {

	public static void main(String[] args) {

		System.out.println("369게임");

		int i = 1;
		while (i <= 50) {
			int x = i / 10;
			int y = i % 10;


			int cnt = 0;
			
//			if (x == 3 || x == 6 || x == 9) {
//				cnt = cnt + 1;
//			}
//
//			if (y == 3 || y == 6 || y == 9) {
//				cnt = cnt + 1;
//			}
			
			if (x != 0 && x % 3 == 0) {
				cnt = cnt + 1;
			}

			if (y != 0 && y % 3 == 0) {
				cnt = cnt + 1;
			}

			if (cnt == 2) {
				System.out.print("짝짝 ");
			} else if (cnt == 1) {
				System.out.print("짝 ");
			} else {
				System.out.print(i+" ");
			}
			i++;
		}
	}

}
