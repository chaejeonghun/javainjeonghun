package whileExam;

public class NoscanneronlyDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ʱⰪ
		int i = 1, j = 2;
		// ��ø do~ while ������ ������ ���;
		do {
			do {
				System.out.println(j + "*" + i + "=" + (i * j) + "\t");
				j++; // ����
			} while (j <= 9);
			i++; // ����
			j = 2; // �ʱ�ȭ
			System.out.println();
		} while (i <= 9);

	}

}
