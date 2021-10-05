package Today1005;

public class Score1 {

	int kor;
	int eng;
	int math;

	// 4유형 (매개변수 x, 리턴타입 x)
	void display() {
		int sum = kor + eng + math;
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + sum / 3);
	}

	// 4유형 (매개변수 x, 리턴타입 x)
	void print() {
		System.out.println(kor + "\t" + eng + "\t" + math);
	}

	// 3번유형 (매개변수 o, 리턴타입 x)
	void print(int kor, int eng, int math) {
		System.out.println(kor + "\t" + eng + "\t" + math);
	}

	// 1유형 (매개변수 o , 리턴타입 o)
	int res(int kor, int eng, int math) {
		return kor + eng + math;
	}

	// 2유형 (매개변수 x, 리턴타입 o)
	int res() {
		return kor + eng + math;
	}
}
