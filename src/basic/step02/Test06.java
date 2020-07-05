package basic.step02;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[2단계]
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 랜덤하게 저장한다.
 * 2. 저장된 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */
//6분
public class Test06 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int num1 = ran.nextInt(8)+2; // 2-10단
		int num2 = ran.nextInt(9)+1; // 1-10까지
		
		int ans = num1*num2;
		
		System.out.printf("[문제]: %d * %d = ", num1, num2);
		int myAns = sc.nextInt();
		
		if(ans == myAns) {
			System.out.println("정답");
		}
		
		if(ans != myAns) {
			System.out.println("땡");
		}
	}

}
