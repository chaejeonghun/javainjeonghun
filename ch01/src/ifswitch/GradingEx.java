package ifswitch;

import java.util.Scanner;

//���� if-else ��
public class GradingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� (0~100) : ");
		int score = scanner.nextInt();

		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';

		System.out.println("������ " + grade + "�Դϴ�.");
		// �ڿ�����
		scanner.close();
	}

}
