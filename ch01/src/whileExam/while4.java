package whileExam;

import java.io.IOException;

public class while4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2~9������ ���ڸ� �Է��ϼ���");
		// Ű����� ���� 0 �� ������ �ԷµǴ� ���� ?

		try {
			int num = System.in.read() - '0';
			System.out.println("������" + num + "��");
			if (num >= 2 && num <= 9) {

				int i = 1;
				while (i <= 9) {
					System.out.println(num + "*" + i + "=" + (i * num));
					i++;
				}
			} else {
				System.out.println("2~9 ������ ���ڸ� �Է��ϼ��� !!");
			}
		} catch (IOException e) {
			System.out.println("�����߻�");
		}

	}

}
