package array2;

public class Array2Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� for���� �̿��Ͽ� 2���� �迭 ��ҵ� ���
		// int -> int[] -> int[][]
		int[][] scores = new int[2][3];
		scores[0][0] = 1;
		scores[0][1] = 2;
		scores[0][2] = 3;
		scores[1][0] = 4;
		scores[1][1] = 5;
		scores[1][2] = 6;

		for (int[] s1 : scores) {
			for (int s : s1) {
				System.out.print(s + " ");

			}
			System.out.println();
		}
	}

}
