package Todaywork;

import java.util.Scanner;

public class work0929Answer {

	public static void main(String[] args) {
		int cnt = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			String id, pw;
			if (cnt == 5) {
				System.out.println(cnt + " ȸ ���� �Ͽ����ϴ�. ���α׷��� �����մϴ�");
				break;
			}
			System.out.println("���̵�� �н����带 �Է��ϼ���.");
			System.out.println("���̵� >");
			id = scanner.next();
			System.out.println("�н����� >");
			pw = scanner.next();

			System.out.println();
			if ("hong".equals(id) && "1234".equals(pw)) {
				System.out.println("�α��� ����");
				break;
			}
			cnt++;
			if (cnt != 5)
				System.out.println(++cnt + "ȸ ���� �Ͽ����ϴ�.");
		}
		System.out.println("���α׷� ����");
	}
}