package basicArr.step04;

import java.util.Scanner;

//1046
public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = { 1001, 20, 1002, 45, 1003, 54 };
		// 학번과 점수가 한쌍이다 1001:20 , 1002:45 , 1003:54

		// 문제1) 학번을 입력하면 점수 출력
		System.out.print("학번입력: ");
		int sId = sc.nextInt();
		int idx = 0;

		for (int i = 0; i < 6; i++) {
			idx += 1;
			if(idx%2==1) {
				
			}
			System.out.println("i" + i + "==>" + arr[i] + " ");
		}
		
		
		
		
		
		

		// 문제2) 점수를 입력하면 학번 출력
		int score[] = { 1001, 20, 43, 1002, 54, 2, 1003, 76, 6 };

		// 학번과 국어 수학 점수이다
		// 예) 1001 == (20 , 43)
		// 1002 == (54 , 2)
		// 1003 == (76 , 6)
		// 문제3) 점수의 합을 입력하면 번호 출력
		// 예) 63 ==> 1001
		// 예) 56 ==> 1002
		// 예) 82 ==> 1003

	}

}
