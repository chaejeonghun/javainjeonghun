package Today1012;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver();
		/*
		 * Bus bus = new Bus(); Taxi taxi = new Taxi();
		 * 
		 * Vehicle vehicle = bus; // �Ű������� ������ driver.drive(bus);
		 * 
		 * bus = (Bus) vehicle; bus.checkFare();
		 */
		driver.drive(new Bus());
		driver.drive(new Taxi());

	}

}
