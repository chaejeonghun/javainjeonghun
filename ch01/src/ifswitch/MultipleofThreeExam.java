package ifswitch;

import java.util.Scanner;

public class MultipleofThreeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println(" ���� �Է��Ͻÿ� : ");
		int number = in.nextInt();

		if (number % 3 == 0)
			System.out.println("3 �� ����Դϴ�.");
		else
			System.out.println("3�� ����� �ƴմϴ�.");

	}

}
