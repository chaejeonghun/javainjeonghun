package ch05;

import java.util.Scanner;

public class ArithmeticExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time = 5000;

		// Ű����� �Է¹��� ��ĳ�� ��ü ����
		Scanner scanner = new Scanner(System.in);

		System.out.println("����� �ʸ� ������ �Է��ϼ��� :");
		time = scanner.nextInt();

		// ��� ������
		int second = time % 60; // 5000�� = minute * 60 + ������ ��
		int minute = (time / 60) % 60; //
		int hour = (time / 60) / 60;

		System.out.println(hour + "�ð�");
		System.out.println(minute + "��");
		System.out.println(second + "�� �Դϴ�.");

	}

}
