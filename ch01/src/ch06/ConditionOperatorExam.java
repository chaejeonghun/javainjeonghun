package ch06;

public class ConditionOperatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5;
		int y = 3;

		int s;
		// 조건문을 이용한 처리
		if (x > y)
			s = 1;
		else
			s = -1;
		System.out.println(s);

		// 삼항식을 이용한 처리
		s = x > y ? 1 : -1;
		System.out.println(s);
	}

}
