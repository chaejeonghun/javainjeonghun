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

		final double a = 1.10;
		final int b = 128;
		boolean run = true;
		int sum = 0;
		String age, height, weight, gender;
		System.out.println("����?");
		gender = scanner.next();
		System.out.println("����?");
		age = scanner.next();
		System.out.println("Ű?");
		height = scanner.next();
		System.out.println("������?");
		weight = scanner.next();

		while (true) {

		}
	}
}
