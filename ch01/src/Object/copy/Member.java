package Object.copy;

//thread, collection, network, file 입출력, 
public class Member {
	private String name;
	private int age;

	public Member(String name, int age) {
		this.name = name; // 참조타입
		this.age = age; // 기본타입
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Object로 부터 상속 받은
	// equals 메소드를 재정의하여 논리적 동등 여부 만들기
//2.equals 메소드 비교	
	@Override
	public boolean equals(Object obj) {
		// 비교시
		// 같은 타입이 아니면 false
		if (obj instanceof Member) {
			// 같은 타입이면 id값 끼리 비교한 결과 true/false
			return this.name.equals(((Member) obj).getName()) && this.age == ((Member) obj).getAge();

		}
		return false;
	}

//1.hash코드 비교
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
