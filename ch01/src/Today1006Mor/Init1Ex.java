package Today1006Mor;

public class Init1Ex {

	public static void main(String[] args) {
		// ���� ���� i1 ����
		Init1 i1 = new Init1();
		int[] b = i1.a; // i1 ��ü�� �迭 ������ b�� ����.(���� ����)
		for (int i : i1.a) {
			System.out.println(i);
		}
	}

}

class Init1 {
	// �ʵ�
	int[] a = new int[5];
	// �ʱ�ȭ �� instance {�ʱ�ȭ ����}
	{
		for (int i = 0; i < a.length; i++) {
			int k = (int) (Math.random() * 10);
			a[i] = k;
		}
	}
}
