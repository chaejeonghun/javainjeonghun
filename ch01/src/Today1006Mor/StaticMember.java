package Today1006Mor;

import java.util.Scanner;

class CurrentConverter {
	private static double rate;

	public static double toDollar(double won) {
		return won / rate;
	}

	public static double toKWR(double dollar) {
		return dollar * rate;
	}

	public static double setRate(double r) {
		return rate = r;
	}

}

public class StaticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ȯ�� (1�޶�)>>");
		double rate = scanner.nextDouble();
		CurrentConverter.setRate(rate);
		System.out.println("�鸸���� $" + CurrentConverter.toDollar(1000000) + "�Դϴ�.");
		System.out.println("$100��" + CurrentConverter.toKWR(100) + "�Դϴ�");
		scanner.close();
	}

}
