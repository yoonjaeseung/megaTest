package basic.step04;

import java.util.Random;

/*
 * # 랜덤학생
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 */
//11분
public class Test05 {

	public static void main(String[] args) {
		Random ran = new Random();

		int tot = 0;
		double avg = 0.0d;
		
		int topScore = 0;
		int top = 0;
		int cnt = 0;
		

		int i = 1;
		while (i <= 5) {
			System.out.print("학생" + i);
			int score = ran.nextInt(100) + 1;

			if (score >= 60) {
				System.out.println("[합격] >> " + score);
				cnt += 1;
			} else {
				System.out.println("[불합격] >> " + score);
			}

			tot = tot + score;
			if (topScore < score) {
				topScore = score;
				top = i;
			}
			

			i++;
		}
		avg = tot / 5.0;
		System.out.println("\n총점: " + tot + " / 총 평균: " + avg);
		System.out.println("합격자: " + cnt);
		System.out.println("1등 >> " + "학생[" + top + "] 점수: " + topScore);

	}

}
