package formain;

public class Exam9by9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		for (i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + i * j + "\t");
			} // \t는 간격 띄우기
			System.out.println(); // 한줄 밑으로 내리는 명령문;
		}
		System.out.println("i=" + i);
	}

}
