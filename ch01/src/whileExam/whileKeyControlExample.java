package whileExam;

import java.util.Scanner;

public class whileKeyControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("------------");
				System.out.println("1.���� | 2. ���� | 3. ���� :");
				System.out.println("------------");
				System.out.println("���� : ");

			}

			// '0'�� int ���� 48 49-48=1, 50-48=2, 51-48=3
			keyCode = scanner.nextInt();

			if (keyCode == 49) { // "1"
				speed++;
				System.out.println("���� �ӵ� = " + speed);
			} else if (keyCode == 50) { // "2"
				speed--;
				System.out.println("���� �ӵ� = " + speed);
			} else if (keyCode == 51) { // "3"
				run = false;
			}
		} // while ��
		System.out.println("����");

	}

}
