package ch05;

public class IncreaseExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = -1;
		// x++; //0

		if (5 / (x++) == 5) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// 증가된 x의 값을 출력하고 싶다.
		System.out.println(x);
	}

}
