package date1001A;

public class Person {
	// �ʵ�
	String name;
	int year;
	int age;

	// ������
	Person(String name, int year) {
		this.name = name;
		this.year = year;

	}

	// �޼ҵ�
	void personInfo() {
		age = 2021 - year;
		System.out.println(name + ", " + age + "");
	}

}
