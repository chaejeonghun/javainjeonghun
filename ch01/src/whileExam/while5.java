package whileExam;

public class while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j = 2;// 초기값 설정
		System.out.println("구구단");
		while (i <= 9) {
			while (j <= 9) {
				System.out.printf("%d * %d = %d \t", j, i, (i * j));
				j++;
			}
			j = 2; // j값 재 초기화, vs for문은 블럭을 시작할때 마다 초기화 되지만, while문은 초기화를 별도로 해주어야한다.
			i++;
			System.out.println();
		}

	}

}
