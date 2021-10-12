package Today1012_5;

public interface Lendable {
	int BORROWED = 1;
	int NORMAL = 0;

	void checkOut(String name, String date);

	void checkIn();
}

class SeperateVolume implements Lendable {
	String requestNo;
	String title;
	String Writter;
	int state;
	String name = "", date = "";

	public SeperateVolume(String requestNo, String title, String writter) {
		this.requestNo = requestNo;
		this.title = title;
		this.Writter = writter;
	}

	@Override
	public void checkOut(String name, String date) {
		if (state == BORROWED)
			return;
		this.name = name;
		this.date = date;
		state = BORROWED;
		System.out.println(title + "�� " + name + " �� �����߽��ϴ�.");
		System.out.println("�������� : " + date);
	}

	@Override
	public void checkIn() {
		name = "";
		date = "";
		state = NORMAL;
		System.out.println(title + " �� �ݳ��߽��ϴ�");

	}

}