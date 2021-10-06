package workplace1005;

import java.util.Scanner;

public class Work1005 {
	// 전역변수
	static Scanner scanner = new Scanner(System.in);
	static String gender;
	static int age;
	static double weight, height;
	static final double maleSTD = 1.10, femaleSTD = 1.07;
	static final int COMSTD = 128, COMSTD2 = 100;
	static boolean run = true;
	static double leanBodyMass;
	static double bodyFatMass;
	static double bodyFatRatio;
	static double leanBodyRatio;

	public static void main(String[] args) {

		while (run) {
			// printMenu();
			// inputInfo();
			// leanBOdyMass = getleanBOdyMass();
			System.out.println("제지방량 : " + leanBodyMass);
			// bodytFatMass=getBodyMass();
		}

	}
//static printMenu();
//static inputInfo();
//static getResult();
}
