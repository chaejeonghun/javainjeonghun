package Todaywork;

import java.util.Scanner;

public class work0929 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// 1.id ="hong", pw = "1234
		// id �� pw�� scanner�� �Է� �޾Ƽ� id�� pw�� �Ѵ� ������ " login ����",
		// �ƴϸ� "1ȸ �����Ͽ����ϴ�." ���
		// 5ȸ �����ϸ�, "5ȸ �����Ͽ����ϴ�. ���α׷��� �����մϴ� " ��� �� ����
		int cnt = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			String id, pw;
			System.out.println("���̵�� �н����带 �Է��ϼ���.");
			System.out.println("���̵� >");
			id = scanner.next();
			System.out.println("�н����� >");
			pw = scanner.next();
			if (id != "hong" || pw != "1234") {

				System.out.println(cnt++ + "ȸ �����Ͽ����ϴ�.");

			}
			if (cnt == 5) {
				System.out.println(cnt + " ȸ ���� �Ͽ����ϴ�. ���α׷��� �����մϴ�");
				break;
			}

			System.out.println();
			if ("hong".equals(id) && "1234".equals(pw)) {
				System.out.println("�α��� ����");
				break;
			}

		}
	}
}
