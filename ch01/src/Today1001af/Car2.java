package Today1001af;

//Ŭ���� ��� - �ʵ�, ������, �޼ҵ�
public class Car2 {
	// �޼ҵ�
	int gas;

//���� Ÿ�� ���� �޼ҵ�
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ� : " + gas + ")");
				gas--;
			} else {
				System.out.println("����ϴ�.(gas�ܷ� : " + gas + ")");
				return; // �޼ҵ� ����
			}
		}
	}
}
