package basicArr.step04;

/*
 * 거꾸로 저장
 */
//13분
//답없음
public class Test02 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int temp4[] = new int[5];

		// 문제1) arr의 값을 temp4에 거꾸로 복사후 출력
		// 예) temp4 ==> {50,40,30,20,10}
		// 힌트 : 아래
		// int i = 0;
		int back = 4;
		// temp4[i] = arr[back];

		for (int i = 0; i < 5; i++) {
			if (back >= 0) {
				temp4[i] = arr[back];
				back -= 1;
			}

			System.out.print(temp4[i] + " ");
		}

	}

}