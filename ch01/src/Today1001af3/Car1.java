package Today1001af3;

public class Car1 {

	// 필드
	String model;
	String color;
	int maxSpeed;

	// 생성자
	Car1() {
	}

	// 동일 클래스내에서 다른 생성자 호출시
	// this()메소드로 호출
	// #주의사항 - 반드시 호출하는 생성자의 첫 라인에 선언 해야함.
	Car1(String model) {
		this.model = model;
	}

	Car1(String model, String color) {
		// Car1(model);
		this(model);
		this.color = color;
	} // String, String

	Car1(String model, String color, int maxSpeed) {
		// Car1(model,color);
		this(model, color);
		this.maxSpeed = maxSpeed;
	} // String, String, int
}
