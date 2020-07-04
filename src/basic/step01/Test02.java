package basic.step01;

/* 
 * #과락
 * 3과목의 평균이 60점 이상이면, true
 * 단, 어느 한 과목이라도 50점 미만이면, false
 * 논리 연산자 사용
 */
//7분
public class Test02 {

	public static void main(String[] args) {
		int kor = 100;
		int eng = 81;
		int math = 51;

		int total = kor + eng + math;
		double avg = total / 3.0;

		System.out.println(kor >= 50 && eng >= 50 && math >= 50 && avg >= 60);
		
	}

}
