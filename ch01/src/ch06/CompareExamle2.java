package ch06;

public class CompareExamle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 25;

		if ((age >= 20) && (age < 30)) {
			System.out.println("20��");
		}
		char c = 'x'; // 'x'=> ASCII�ڵ尪 ��

		if ((c >= 'A') && (c <= 'Z')) {
			System.out.println("����빮��");
		}

		int x = 50;
		int y = 25;
		if ((x >= 0) && (y >= 0) && (x <= 50) && (y <= 50)) {
			System.out.println("�������� �ִ� ��ǥ");
		}

	}

}
