package verify;

public class Ex18 {

}
//�̱���
//1. �ڽ�Ÿ���� private �ʵ����
//2. default�����ڸ� private�� ����
//3. public getInstance() �޼ҵ� ����

class ShopService {
	private static ShopService instance = new ShopService();

	private ShopService() {
	}

	private static ShopService getInstance() {
		return instance;
	}

}