package date1001A;

public class Person {
	// 필드
	String name;
	int year;
	int age;

	// 생성자
	Person(String name, int year) {
		this.name = name;
		this.year = year;

	}

	// 메소드
	void personInfo() {
		age = 2021 - year;
		System.out.println(name + ", " + age + "");
	}

}
