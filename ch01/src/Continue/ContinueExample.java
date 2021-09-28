package Continue;

import java.util.Scanner;

// 5개의 정수를 키보드로 부터 입력 받고 그중 양수들만 합한 결과 출력
public class ContinueExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요 :");
		int sum = 0;

		for (int i = 0; i < 5; i++) { // 반복 횟수로 사용
			int n = scanner.nextInt();
			if (n < 0)
				continue; // 음수인경우 skip하기
			else
				sum += n; // 양수 인 경우 더하기

		}

		System.out.println(" 양수의 합은 :" + sum);
		// 1.7 autoclosealbe
		scanner.close();

	}

}
