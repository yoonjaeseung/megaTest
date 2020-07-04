package basic.step01;
/*
 * #값 교체하기
 */
//3분
public class Test01 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int temp = x;
		
		x = y;
		y = temp;
		
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);

	}

}
