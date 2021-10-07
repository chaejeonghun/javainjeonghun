package verify;

public class Ex18 {

}
//싱글톤
//1. 자신타입의 private 필드생성
//2. default생성자를 private로 선언
//3. public getInstance() 메소드 선언

class ShopService {
	private static ShopService instance = new ShopService();

	private ShopService() {
	}

	private static ShopService getInstance() {
		return instance;
	}

}