package basic.step01;

/*
 * #최소 화폐매수 구하기
 * 정답: 5천원(1장), 1천원(3장), 5백원(1개), 1백원(2개)
 */
//10분
public class Test03 {

	public static void main(String[] args) {
		int money = 8700;
		int tFive = money / 5000;
		int tOne = (money % 5000) / 1000;
		int hFive = ((money % 5000) % 1000) / 500;
		int hOne = (((money % 5000) % 1000) % 500) / 100;

		System.out.println("5천원: " + tFive + " 1천원: " + tOne + " 5백원: " + hFive + " 1백원: " + hOne);
	}

}
