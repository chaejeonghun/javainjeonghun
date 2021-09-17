package ch06;

public class CompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(3 < 5); // t
		System.out.println(3 > 5); // f
		System.out.println(1 <= 5); // t
		System.out.println(10 >= 10); // t
		System.out.println(1 == 3); // f
		System.out.println(1 != 3); // t

		System.out.println(!(3 < 5)); // f
		System.out.println((3 < 5) ^ (1 == 1)); // f
		System.out.println((3 > 5) || (1 == 1)); // T or T = T
		System.out.println((3 < 5) && (1 == 1)); // T and T= T

	}

}
