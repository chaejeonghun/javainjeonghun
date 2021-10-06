package Today1006Mor;

public class Init4Ex {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		p1.print();
		p2.print();
		p3.print();

	}
}

class Product {
	// static 필드
	static int cnt;

	// instance 필드
	int serialNo;
	// instance 초기화 블럭
	{
		cnt++; // static 필드 증가
		serialNo = cnt; // 증가된 static 필드값을 객체 생성시 각 인스턴스 변수에 저장
	}

	// instance method
	void print() {
		System.out.println("제품 번호 : " + serialNo);
	}
}