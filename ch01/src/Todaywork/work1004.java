package Todaywork;

/*���� ������� 10/4�� 23:59���� 
 * ��ĳ�ʷ� �Է°� �Է� �ޱ� ����, ����, Ű, ������ 
 * �ݺ�ó�� �����ϰ� ����� 
 * ��� ���� ����� yes/no ���� �޾Ƽ� �����ϵ��� �����ϱ�
 * */
import java.util.Scanner;

public class work1004 {

	public static void main(String[] args) {
		String[] strArray = new String[4];
		// TODO Auto-generated method stub
		// ü���淮 ������
		// ü����� = ������ - ü���淮;
		// ����ǥ�� ü���淮 - (1.10*ü��) - (128*(ü��kg^2/Ű cm^2)
		// ü�� 75 kg Ű 175cm �� ������ ǥ�� ü���淮�� ���ϱ�� ?
		Scanner scanner = new Scanner(System.in);

		double a = 1.10, b = 128;
		boolean run = true;
		int sum = 0;

		for (int i = 0; i < strArray.length; i++) {
			System.out.println("���� : ");
			strArray[i] = scanner.nextLine();
			System.out.println("���� : ");
			strArray[i] = scanner.nextLine();
			System.out.println("Ű : ");
			strArray[i] = scanner.nextLine();
			System.out.println("������ : ");
			strArray[i] = scanner.nextLine();
			for (int j = 0; j < strArray.length; j++) {
				System.out.println("���� : " + strArray[i]);
				System.out.println("���� : " + strArray[i] + 1);
				System.out.println("Ű : " + strArray[i] + 2);
				System.out.println("������ : " + strArray[i] + 3);
			}
			while (true) {

				System.out.println("ü����� �Ի��� ���� �ұ��? yes or no");
				String text = scanner.nextLine();
				System.out.println(text);
				if (text.equals("no"))
					break;

			}

		}

	}
}
