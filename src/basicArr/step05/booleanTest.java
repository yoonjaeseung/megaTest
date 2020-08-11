package basicArr.step05;

import java.util.Scanner;

public class booleanTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int x = 0;
		// x = 1;

		System.out.print("true(1) false(0): ");
		int x = sc.nextInt();

		boolean test = x == 2;
		if (test) {
			System.out.println("값은 true");
		} else {
			System.out.println("값은 fasle");
		}
	}
}
