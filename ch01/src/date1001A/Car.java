package date1001A;

//Ŭ���� ��� - �ʵ�, ������, �޼ҵ�
public class Car {
	// �޼ҵ�
//���� Ÿ�� �޼ҵ��(�Ű�����){����� ���� return�� �ݵ�� �־����.}
	boolean isLeftGas() {
		int gas = 5;
		// ���ǿ� ���� return���� ����Ǵ�
		// ������ ��� �ڿ� returnó�� �Ŀ�
		// ������ false�� ��� ������ ��ɹ��� �ü� �ִ�.
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}

}
