package Today0930af;

public class UseCarExample {
	public static void main(String[] args) {
		// Car타입 변수 = new Car();
		Car car = new Car();
		System.out.println(car.model);
		car.run();
		Truck truck = new Truck();
		System.out.println(truck.model);
		truck.run();
		Bus bus = new Bus();
		System.out.println(bus.model);
		bus.run();
	}
}
