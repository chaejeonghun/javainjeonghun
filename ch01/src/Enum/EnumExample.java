package Enum;

import java.util.Scanner;

public class EnumExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// name()method
		Week today = Week.SUNDAY;
		String name = today.name();// ����Ÿ�� -> String Ÿ������ ��ȯ
		System.out.println(name);

		// ordinal()method
		int ordinal = today.ordinal();
		System.out.println(ordinal);

		// compareTo()method
		Week day1 = Week.MONDAY;
		Week day2 = Week.WENDSDAY;
		int result1 = day1.compareTo(day2); // 0 -2
		int result2 = day2.compareTo(day1); // 2 -0
		System.out.println(result1);
		System.out.println(result2);

		// valueOF()method : String -> ����
		System.out.println("������ ���Ż�� �������� �Է����ּ���.");
		String strDay = scanner.next();

		Week weekDay = Week.valueOf(strDay); // ��ĳ�ʷ� �Է� ���� ���ڿ��� ->
												// -> week ����� ��ȯ

		switch (weekDay.ordinal()) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("�����Դϴ�.");
		case 5:
		case 6:
			System.out.println("�ָ��Դϴ�.");
		}

		if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {

			System.out.println("�ָ��Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}

		// values() method
		Week[] days = Week.values();
		for (int i = 0; i < days.length; i++)
			System.out.println(days[i] + " ");
		System.out.println();

		for (Week d : days)
			System.out.println(d + " ");

	}

}
