package basic.step02;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */
//4분
public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int coin = ran.nextInt(2);
		
		if(coin == 0) {
			System.out.println("치트키 = 앞면");
		}
		
		if(coin == 1) {
			System.out.println("치트키  = 뒷면");
		}
		
		
		System.out.println("동전맞추기 게임[앞면:0, 뒷면:1]");
		
		int ans = sc.nextInt();
		if(coin == ans) {
			System.out.println("정답");
		}
		if(coin != ans) {
			System.out.println("땡");
		}
		
	}

}
