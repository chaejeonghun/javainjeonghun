package ch04;

public class ByteOverflowExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = -128; i < 500; i++) {
			System.out.println(i + ":" + (byte) i);
		}
	}

}
