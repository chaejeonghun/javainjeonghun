package Todaywork;

import java.util.Scanner;

public class work0929 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		final double maleSTD = 1.10, femaleSTD = 1.07;
		final int COMSTD = 128, COMSTD2 = 100;

		while (run) {
			System.out.println("========================================");
			System.out.println(" 정확한 계산을 위하여 아래 정보를 입력 바랍니다");
			System.out.println("========================================");
			System.out.print("성별(남자(M)/여자(F) 입력) >");
			String gender = scanner.next();
			System.out.print("나이를 입력(정수:10~39) > ");
			int age = scanner.nextInt();
			System.out.print("키를 입력(단위:cm) > ");
			double height = scanner.nextDouble();
			System.out.print("몸무게를 입력(단위:kg) > ");
			double weight = scanner.nextDouble();

			// 1. 제지방량 구하기
			// 남성 = (1.10 * 체중) - (128 * (체중*체중)/(키*키))
			// 여성 = (1.07 * 체중) - (128 * (체중*체중)/(키*키))
			double leanBodyMass = 0.0;
			switch (gender) {
			case "M":
				leanBodyMass = (maleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height)));
				break;
			case "F":
				leanBodyMass = (femaleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height)));
				break;
			}

			System.out.println("결과:>");
			System.out.printf("제지방량:%.2f\n", leanBodyMass);

			System.out.println("계속할까요?(yes/No)");
			String yesNo = scanner.next();
			if (yesNo.equals("No"))
				run = !run;
		} // while문 끝.
	}
}
