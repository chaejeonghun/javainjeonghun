package whileExam;

import java.io.IOException;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean run = true;

		int keycode = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			if (keycode != 13 && keycode != 10) {
				System.out.println("--------------");
				System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
				System.out.println("--------------");

			}
			keycode = System.in.read();
			if (keycode == 49) {
				System.out.println("���� > 1");
				System.out.print("���ݾ� > 10000");
			} else if (keycode == 50) {
				System.out.println("���� > 2");
				System.out.println("��ݾ� > 2000");
			} else if (keycode == 51) {
				System.out.println("���� > 3");
				System.out.println("�ܰ� > 8000");
			} else if (keycode == 52) {
				System.out.println("���α׷� ����");

			}

		}

	}

}
