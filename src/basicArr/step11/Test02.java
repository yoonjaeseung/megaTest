package basicArr.step11;

//# 삼각형 출력하기

/*
 * 문제 1)
 * #
 * ##
 * ###
 */

/*
 * 문제 2)
 * ###
 * ##
 * #
 */

/*
 * 문제 3)
 * @##
 * @@#
 * @@@
 */

/*
 * 문제 4)
 *   #
 *  ###
 * #####
 */


public class Test02 {

	public static void main(String[] args) {
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		for(int i=0; i<9; i++) {
			System.out.print("#");
			if(i % 3 == 2) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}




	}

}
