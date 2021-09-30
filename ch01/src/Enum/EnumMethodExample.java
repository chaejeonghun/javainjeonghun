package Enum;

import java.util.Scanner;

//열거타입 메소트 들
public class EnumMethodExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// name()method
		Week today = Week.SUNDAY;
		String name = today.name();// 열거타입 -> String 타입으로 변환
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

		// valueOF()method : String -> 열거
		System.out.println("요일을 열거상수 형식으로 입력해주세요.");
		String strDay = scanner.next();

		Week weekDay = Week.valueOf(strDay); // 스캐너로 입력 받은 문자열을 ->
												// -> week 상수로 변환
		if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말입니다.");
		} else {
			System.out.println("평일입니다.");
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
