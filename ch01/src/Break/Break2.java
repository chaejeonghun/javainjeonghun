package Break;

public class Break2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 9; i++) {
			System.out.print("i=" + i + "\t");
			for (int j = 0; j <= 9; j++) {
				System.out.print("j=" + j + "\t");
				if (j > 3)
					break; // ���� for����
			}
			System.out.println(); // ���� ������
		}

	}

}
