package Today1012;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	// 추가된 메소드
	public void checkFare() {
		System.out.println("승차 요금 체크");
	}
}

class Taxi implements Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}

}