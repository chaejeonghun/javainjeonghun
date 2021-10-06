package Today1006Mor;

import java.util.Scanner;

public class Person {
	// final 필드는 선언과 동시에 초기화
	final String nation = "Korea";
	// 생성자에서 final필드를 초기화할 수 있는 경우 선언만 해놔도 오류 발생 x
	final String ssn;
	String name;

	// 생성자에 final 필드를 초기화 하는 명령문 포함.
	public Person(String ssn, String name) {

		this.ssn = ssn;
		this.name = name;
	}

	public static void main(String[] args) {
		Person[] persons = new Person[10000];
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int index = 0;
		while (run) {
			String ssn = scanner.next();
			String name = scanner.next();
			Person person = new Person(ssn, name);
			persons[index++] = person;
		}
		Person person = new Person("20211006 -1234567", " 홍길동");
		// person.nation = " usa ";
		// person.ssn = "1234";
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
	}
}
