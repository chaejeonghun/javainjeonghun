package Today0930af;

//클래스의 상속의 대상 - 부모 클래스의 필드, 메소드
public class Truck extends Car {
	// 필드 (속성, property, 멤버 변수 )
	public String model = "truck";

	@Override
	public void run() {
		System.out.println("트럭이 달립니다.");

	}

}
