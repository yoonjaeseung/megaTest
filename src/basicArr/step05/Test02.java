package basicArr.step05;

/*
 * # 4의 배수만 저장
 * - arr 배열에서 4의 배수만 골라 temp 배열에 저장
 */
// 5분
public class Test02 {
	public static void main(String[] args) {
		int[] arr = { 44, 11, 29, 24, 76 };
		int[] temp = null;

		// start
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;

			}
		}
		System.out.println(cnt);

		temp = new int[cnt];

		int j = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				temp[j] = arr[i];
				System.out.print(temp[j] + " ");
				j++;
			}
		}
		System.out.println();
		
//		for(int i=0;i<cnt;i++) {
//			System.out.print(temp[i] + " ");			
//		}

	}
}
