package ch05;

public class IncreaseDecreaseOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 10;
		int z;

		// �ܵ� ������ �ƴ� �ٸ� ����� �Բ� ����Ǵ� ���
		z = x++;
		System.out.println(z); // 10
		System.out.println(x); // 11

		// ���� x = 11, z= 10
		z = ++x;
		System.out.println(z); // 12
		System.out.println(x); // 12

		z = y--;
		System.out.println(z); // 10
		System.out.println(y); // 9

		z = --y;
		System.out.println(z); // 8
		System.out.println(y); // 8

		System.out.println("------------------");
		x++; // ���� ����
		System.out.println(x);
		++x; // ���� ����
		System.out.println(x);
		System.out.println("------------------");
		y--;
		System.out.println(y);
		--y;
		System.out.println(y);
		System.out.println("------------------");

	}

}
