package ch07;

public class BitWiseShiftOperationExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// <<���� shift ���� �� ������ ������ 0 ����ä��.
		byte a = 5;
		byte b = (byte) (a << 2); // byte, short, char�� ����� int�� ��ȯ �� ���꿡 ����
		System.out.println(b);

		// ������ shift(>>)�� �ֻ��� ��Ʈ�� ���ʿ� ä��.
		// int Ÿ���� ���� ����̸� �ֻ��� ��Ʈ�� 0,
		// �����̸� �ֻ��� ��Ʈ�� 1�̴�.
		a = 20;
		b = (byte) (a >> 2); // byte, short, char�� ����� int�� ��ȯ �� ���꿡 ������.
		System.out.println(b);

		// ������ shift(>>) 2�� ¥�� ����� ���� ������ �ֻ��� ��Ʈ�� 1�̹Ƿ�
		// ���ʿ��� 1�� ä����
		byte c = (byte) 0xf8; // -8
		byte d = (byte) (c >> 2); // -2 = -8/2 => -4/2 = -2
		System.out.println(c); // shift ������ ��
		System.out.println(d); // shift ������ ��

		// ������ shift(>>>) 3�� ¥���� ����� ���ʿ� ������ 0���� ä��.
		byte e = 20;
		byte f = (byte) (e >>> 2);
		System.out.println(f);

	}

}
