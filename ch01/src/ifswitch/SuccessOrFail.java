package ifswitch;

import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("점수를 입력하세요 - 정수로: ");
		int score = scanner.nextInt();
		// 조건이 참이면 {}블럭 실행
		// if(score>=) {
		// System.out.println("축하합니다. 합격입니다.");
		// }
		// dangling 실패

		if (score >= 80) {
			System.out.println("축하합니다. 합격입니다.");
		} else {
			System.out.println("불합격입니다. 다음에 다시 도전해주세요.");
		}
		scanner.close();
	}

}
