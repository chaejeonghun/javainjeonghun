package ch05;

import java.util.Scanner;

public class ArithmeticExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time = 5000;

		// 키보드로 입력받을 스캐너 객체 생성
		Scanner scanner = new Scanner(System.in);

		System.out.println("계산할 초를 정수로 입력하세요 :");
		time = scanner.nextInt();

		// 몫과 나머지
		int second = time % 60; // 5000초 = minute * 60 + 나머지 초
		int minute = (time / 60) % 60; //
		int hour = (time / 60) / 60;

		System.out.println(hour + "시간");
		System.out.println(minute + "분");
		System.out.println(second + "초 입니다.");

	}

}
