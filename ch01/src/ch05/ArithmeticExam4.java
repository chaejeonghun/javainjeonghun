package ch05;

import java.util.Scanner;

public class ArithmeticExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 69;

		Scanner scanner = new Scanner(System.in);
		System.out.println("두자리 숫자를 입력하세요 :");
		input = scanner.nextInt();

		System.out.println("십의자리수:" + (input / 10)); // 몫
		System.out.println("1의자리수:" + (input % 10)); // 나머지

		if (input % 2 == 0) {
			System.out.println("짝수");

		} else {
			System.out.println("홀수");
		}
	}

}
