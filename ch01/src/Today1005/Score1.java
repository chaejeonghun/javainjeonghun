package Today1005;

public class Score1 {

	int kor;
	int eng;
	int math;

	// 4���� (�Ű����� x, ����Ÿ�� x)
	void display() {
		int sum = kor + eng + math;
		System.out.println("�հ� :" + sum);
		System.out.println("��� :" + sum / 3);
	}

	// 4���� (�Ű����� x, ����Ÿ�� x)
	void print() {
		System.out.println(kor + "\t" + eng + "\t" + math);
	}

	// 3������ (�Ű����� o, ����Ÿ�� x)
	void print(int kor, int eng, int math) {
		System.out.println(kor + "\t" + eng + "\t" + math);
	}

	// 1���� (�Ű����� o , ����Ÿ�� o)
	int res(int kor, int eng, int math) {
		return kor + eng + math;
	}

	// 2���� (�Ű����� x, ����Ÿ�� o)
	int res() {
		return kor + eng + math;
	}
}
