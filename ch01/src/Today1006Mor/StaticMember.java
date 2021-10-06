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
		System.out.println("환율 (1달라)>>");
		double rate = scanner.nextDouble();
		CurrentConverter.setRate(rate);
		System.out.println("백만원은 $" + CurrentConverter.toDollar(1000000) + "입니다.");
		System.out.println("$100은" + CurrentConverter.toKWR(100) + "입니다");
		scanner.close();
	}

}
