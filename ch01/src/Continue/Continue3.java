package Continue;

public class Continue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Label: for (int i = 0; i <= 9; i++) {
			System.out.print("i=" + i + "\t");
			for (int j = 0; j <= 9; j++) {
				System.out.print("j=" + j + "\t");
				if (j > 2)
					continue Label;
				System.out.print("나두 출력되나\t");
			}
			System.out.println(); // 한줄 내리기
		}

	}

}
