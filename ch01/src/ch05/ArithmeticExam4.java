package ch05;

import java.util.Scanner;

public class ArithmeticExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 69;

		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� ���ڸ� �Է��ϼ��� :");
		input = scanner.nextInt();

		System.out.println("�����ڸ���:" + (input / 10)); // ��
		System.out.println("1���ڸ���:" + (input % 10)); // ������

		if (input % 2 == 0) {
			System.out.println("¦��");

		} else {
			System.out.println("Ȧ��");
		}
	}

}
