package ch05;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean play = true;

		System.out.println(play);

		play = !play; // !true -> not true -> false
		System.out.println(play);

		play = !play; // !false -> not false -> true
		System.out.println(play);
		// !는 논리연산자 부정

		int i = 0;
		while (play) {
			i++;
			System.out.println("hello");
			if (i == 5)
				play = !play;

		}

		System.out.println("종료");
	}

}
