package ifswitch;

import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("������ �Է��ϼ��� - ������: ");
		int score = scanner.nextInt();
		// ������ ���̸� {}�� ����
		// if(score>=) {
		// System.out.println("�����մϴ�. �հ��Դϴ�.");
		// }
		// dangling ����

		if (score >= 80) {
			System.out.println("�����մϴ�. �հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�. ������ �ٽ� �������ּ���.");
		}
		scanner.close();
	}

}
