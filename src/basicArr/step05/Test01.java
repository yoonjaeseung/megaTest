package basicArr.step05;

import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */
// 20분 / 다시 / 7분
public class Test01 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1
		// 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}

		// start
		Scanner sc = new Scanner(System.in);
		System.out.println("문제1>>>");

		System.out.print("인덱스1 입력[1~5]: ");
		int idx1 = sc.nextInt();
		System.out.print("인덱스2 입력[1~5]: ");
		int idx2 = sc.nextInt();

		idx1 = idx1 - 1;
		idx2 = idx2 - 1;

		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 40
		// 값2 입력 : 20
		// {10, 20, 30, 40, 50}

		// start
		System.out.println("문제2>>>");
		System.out.print("값1 입력: ");
		int val = sc.nextInt();
		System.out.print("값2 입력: ");
		int val2 = sc.nextInt();

		temp = 0;
		idx1 = 0;
		idx2 = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] == val) {
				idx1 = i;
			}
			if (arr[i] == val2) {
				idx2 = i;
			}
		}

		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예 3) 학번1 입력 : 1002
		// 학번2 입력 : 1003
		// {87, 45, 11, 98, 23}

		// start
		System.out.println("문제3>>>");

		System.out.print("학번1 입력: ");
		int data1 = sc.nextInt();

		System.out.print("학번2 입력: ");
		int data2 = sc.nextInt();

		temp = 0;
		idx1 = 0;
		idx2 = 0;
		for (int i = 0; i < 5; i++) {
			if (hakbuns[i] == data1) {
				idx1 = i;
			}
			
			if(hakbuns[i]==data2) {
				idx2 = i;
			}
		}
		
		temp = scores[idx1];
		scores[idx1] = scores[idx2];
		scores[idx2] = temp;
		
		for(int i = 0;i<scores.length;i++) {
			System.out.print(scores[i]+" ");
		}
		System.out.println();

	}

}
