package Object.copy;

//thread, collection, network, file �����, 
public class Member {
	private String name;
	private int age;

	public Member(String name, int age) {
		this.name = name; // ����Ÿ��
		this.age = age; // �⺻Ÿ��
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

	// Object�� ���� ��� ����
	// equals �޼ҵ带 �������Ͽ� ���� ���� ���� �����
//2.equals �޼ҵ� ��	
	@Override
	public boolean equals(Object obj) {
		// �񱳽�
		// ���� Ÿ���� �ƴϸ� false
		if (obj instanceof Member) {
			// ���� Ÿ���̸� id�� ���� ���� ��� true/false
			return this.name.equals(((Member) obj).getName()) && this.age == ((Member) obj).getAge();

		}
		return false;
	}

//1.hash�ڵ� ��
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
