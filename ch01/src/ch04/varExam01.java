package ch04;

class varExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1;

		if (true) {
			// main �޼ҵ� ���� if ������ ����� ���� ����
			int var2;
			var1 = 1; // main �޼ҵ� ���� if�� ������ ��� ����
			var2 = 2; // �ڽ��� ����� �� ������ ��밡��
			int result = var1 + var2;
			System.out.println(result);

		}

		while (true) {
			// main�޼ҵ峻�� while ������ ����� ���� ����
			int var3;
			System.out.println(var1); // main���� ����ǰ� if������ ���� �ٲ� ����
			var3 = 3;
			var1 = 4; // while ���ۼ� ���ο� �� ����
			System.out.println(var1 + var3);
			// var2= 5; //
			break; // �ݺ����� ���� ������ �ϴ� ��ɾ�
		}

		System.out.println(var1);
		// System.out.println(var2);
		// System.out.println(var3);

	}
}