package Today1006Mor;

import java.util.Scanner;

public class Person {
	// final �ʵ�� ����� ���ÿ� �ʱ�ȭ
	final String nation = "Korea";
	// �����ڿ��� final�ʵ带 �ʱ�ȭ�� �� �ִ� ��� ���� �س��� ���� �߻� x
	final String ssn;
	String name;

	// �����ڿ� final �ʵ带 �ʱ�ȭ �ϴ� ��ɹ� ����.
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
		Person person = new Person("20211006 -1234567", " ȫ�浿");
		// person.nation = " usa ";
		// person.ssn = "1234";
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
	}
}
