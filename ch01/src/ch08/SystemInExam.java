package ch08;

public class SystemInExam {

	// ǥ�� �Է½�Ʈ������ �� �Է½� I/O���� �߻� ���ɼ� ����. - ����ó��
	public static void main(String[] args) throws Exception { // throws Exception ����ó�� ����
		// TODO Auto-generated method stub

		// ǥ�� �Է� ��Ʈ������ �� �Է� �ޱ�
		System.out.println("�Է� :");
		int a = System.in.read();
		System.out.println("��� : " + a); // keyboard�� Ű�� �Է��� Enter Ű�� ����
		// (EnterŰ = '\r''\n')
		System.in.read();
		System.in.read();

		// System.in.read() -48 or '0'; == ����
		System.out.println("�Է� :");
		int num = System.in.read() - 48;
		// int num = System.in.read()-'0';
		System.out.println("��� : " + num);
		System.in.read();
		System.in.read();

		// (char)System.in.read(); == ����
		System.out.println("�Է� : ");
		char char_ = (char) System.in.read();
		// int num =System.in.read()-'0';
		System.out.println("��� : " + char_);

	}

}
