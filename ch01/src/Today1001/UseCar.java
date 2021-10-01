package Today1001;

public class UseCar {

	public static void main(String[] args) {
		Car car = new Car();
		// 필드 선언시 값을 주면 해당 값 출력
		System.out.println("model : " + car.model);
		System.out.println("maxSpeed : " + car.maxSpeed);
		// 필드 선언시 값을 주지 않으면 해당 타입의 기본값으로 출력
		System.out.println("현재속도 : " + car.currentSpeed);
		System.out.println("시동 여부 : " + car.engine);
		System.out.println("Tire : " + car.tire);
		System.out.println("Handle : " + car.handle);

	}

}
