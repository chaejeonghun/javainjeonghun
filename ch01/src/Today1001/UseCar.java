package Today1001;

public class UseCar {

	public static void main(String[] args) {
		Car car = new Car();
		// �ʵ� ����� ���� �ָ� �ش� �� ���
		System.out.println("model : " + car.model);
		System.out.println("maxSpeed : " + car.maxSpeed);
		// �ʵ� ����� ���� ���� ������ �ش� Ÿ���� �⺻������ ���
		System.out.println("����ӵ� : " + car.currentSpeed);
		System.out.println("�õ� ���� : " + car.engine);
		System.out.println("Tire : " + car.tire);
		System.out.println("Handle : " + car.handle);

	}

}
