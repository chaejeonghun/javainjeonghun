package formain;

public class ForExam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for(�ʱ�ȭ; for ���� ���������� ����; ����){���๮;}
		for (int i = 1, y = 1; i < 10; i++, System.out.println(y)) { // for ���� ���������� ������ true
			// true�� ���� ��쵵 ������ true�� ����
			System.out.println("hello");
			// for ���� ���������� ������ �������� ó��{}
			if (i == 10)
				break;
			y++;
		}
		// System.out.println("����");
	}

}
