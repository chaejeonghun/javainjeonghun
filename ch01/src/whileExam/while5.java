package whileExam;

public class while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j = 2;// �ʱⰪ ����
		System.out.println("������");
		while (i <= 9) {
			while (j <= 9) {
				System.out.printf("%d * %d = %d \t", j, i, (i * j));
				j++;
			}
			j = 2; // j�� �� �ʱ�ȭ, vs for���� ���� �����Ҷ� ���� �ʱ�ȭ ������, while���� �ʱ�ȭ�� ������ ���־���Ѵ�.
			i++;
			System.out.println();
		}

	}

}
