package array2;

import java.io.IOException;
import java.util.Scanner;

public class ArrayExam4 {

	public static void main(String[] args) throws IOException {
		// ����ǥ ���α׷�
		// ��ĳ�ʷ� �� �Է¹ޱ� int[]score ={76, 45, 34, 89, 100, 50, 90, 92};
		// �Է��� ������ �հ�, ��� ����ϱ�
		// for���� ���� for������ ����ϱ�
		// 1.�����Է� | 2.���(��/���)��� | 3. ������ ����ϱ� | 4.����
		int[] scores = new int[8];
		int a = scores.length;
		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		int keycode = 0;

		while (run) {
			if (keycode != 13 && keycode != 10) {

				System.out.println("1.�����Է� | 2.���(��/���)��� | 3.������ ����ϱ� | 4.����");
				System.out.println("--------------");

			}
			keycode = System.in.read();
			if (keycode == 49) {
				System.out.println("���� > 1. �����Է�");
				for (int i = 0; i < a; i++) {
					System.out.print("���� �Է� �Է��ϼ���");
					scores[i] = scanner.nextInt();
				}
				for (int i = 0; i < a; i++) {
					System.out.print("���� :" + scores[i]);
				}
				System.out.println();
			} else if (keycode == 50) {
				System.out.println("���� > 2. ���(��/���)���");
				int total = 0;
				for (int j = 0; j < scores.length; j++) {
					total += scores[j];

				}
				System.out.println("�հ� : " + total);
				double avg;
				avg = total / (double) scores.length;
				System.out.println("���: " + avg);
				System.out.println();

			} else if (keycode == 51) {
				System.out.println("���� > 3. ������ ���");
				int temp = 0;
				for (int i = 0; i < scores.length; i++) {
					for (int j = i + 1; j < scores.length; j++) {
						if (scores[i] > scores[j]) {
							temp = scores[i];
							scores[i] = scores[j];
							scores[j] = temp;

						}

					}

					System.out.print(scores[i] + "\t");

				}
				System.out.println();
				for (int i = 0; i < scores.length; i++) {
					for (int j = i + 1; j < scores.length; j++) {
						if (scores[i] < scores[j]) {
							temp = scores[i];
							scores[i] = scores[j];
							scores[j] = temp;
						}
					}
					System.out.print(scores[i] + "\t");
				}
				System.out.println();

			} else if (keycode == 52) {
				System.out.println("���α׷� ����");

			}

		}
	}
}