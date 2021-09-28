package formain;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if ((4 * i) + (5 * j) == 60) {
					sum += i + j;
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}

	}

}
