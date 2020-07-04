package basic.step02;

import java.util.Random;

/*
 * # 당첨복권[1단계] 30%의 당첨확률
 */

public class Test04 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int num = ran.nextInt(10);
		
		if(num < 3) {
			System.out.println("당첨");
		}
		
		if(num >= 3) {
			System.out.println("꽝");
		}
	}

}
