package basicArr.step09;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 추가
 */


public class Test01_add {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		
		boolean run = true;
		while(run) {

			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();			
			
			System.out.println("[1]추가");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				
				System.out.print("추가할 값 입력 : ");
				int data = sc.nextInt();
				
			}
			
		}


	}

}
