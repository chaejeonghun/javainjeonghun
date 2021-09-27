package Break;

public class Break3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이 중 반복 문을 전체 빠져 나가려면 바깥쪽 for 문이나 while 앞에 Label: 표시
		// break 문 뒤에 Label 표시
		Label: for (int i = 0; i <= 9; i++) {
			System.out.print("i=" + i + "\t");
			for (int j = 0; j <= 9; j++) {
				System.out.print("j=" + j + "\t");
				if (j > 3)
					break Label; // Label로 표시된 바깥쪽 for 문을 벗어남
			}
			System.out.println();// 한줄 내리기
		}

	}

}
