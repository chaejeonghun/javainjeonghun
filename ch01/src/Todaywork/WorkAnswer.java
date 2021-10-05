package Todaywork;

import java.util.Scanner;

/* ü���� ���ϱ� */
public class WorkAnswer {

	public static void main(String[] args) {
		// 1. ������ ���ϱ� : ���� 1.10*ü�� -(128*(ü��^2)/(Ű^2))
		// ���� 1.10*ü�� -(128*(ü��^2)/(Ű^2))
		// 2. ü���淮 = ü�� - �����淮
		// 2-1. �������� = �����淮*100/ü��
		// 3. ü������ - ü���淮 *100/ü��
		//
		boolean run = true;
		while (run) {
			Scanner scanner = new Scanner(System.in);
			final double maleSTD = 1.10, femaleSTD = 1.07;
			final int COMSTD = 128, COMSTD2 = 100;

			System.out.println("==========================");
			System.out.println(" ��Ȯ�� ����� ���Ͽ� �Ʒ� ������ �Է� ���ּ��� ");
			System.out.println("==========================");
			System.out.println("����(����(M))/����(F) �Է�)>");
			String gender = scanner.next();
			System.out.println("����(���� : 10 ~ 39 �Է�) >");
			int age = scanner.nextInt();
			System.out.println("Ű �Է�(���� : cm)>");
			double height = scanner.nextDouble();
			System.out.println("������ �Է�(���� :kg)>");
			double weight = scanner.nextDouble();

			// 1.�����淮 ���ϱ�
			double leanBodyMass = 0.0;
			switch (gender) {
			case "M":
				leanBodyMass = (maleSTD * weight) - ((COMSTD * (weight * weight) / (double) (height * height)));
			case "F":
				leanBodyMass = (femaleSTD * weight) - ((COMSTD * (weight * weight) / (double) (height * height)));
			}
			// 2.ü���淮 ���ϱ�
			double bodyFatMass = 0.0;
			bodyFatMass = weight - leanBodyMass;

			// 2-1.������� (=�����淮*100)/ü��
			double leanBodyRatio = (leanBodyMass * COMSTD2) / (double) weight;

			// 3.ü����� ���ϱ� (=ü���淮*100/ü��)
			double bodyFatRatio = (bodyFatMass * COMSTD2) / (double) weight;

			// 4.�񸸵� ���
			// ��/��
			String result = "";
			switch (gender) {
			case "M":
				if (bodyFatRatio <= 12)
					result = "����";
				else if (bodyFatRatio <= 17)
					result = "ǥ��";
				else if (bodyFatRatio <= 22)
					result = "��ü��";
				else if (bodyFatRatio <= 27)
					result = "��";
				else
					result = "����";
				break;
			case "F":
				if (bodyFatRatio <= 22)
					result = "����";
				else if (bodyFatRatio <= 27)
					result = "ǥ��";
				else if (bodyFatRatio <= 35)
					result = "��ü��";
				else if (bodyFatRatio <= 40)
					result = "��";
				else
					result = "����";
				break;
			}

			System.out.println("��� :>");
			System.out.printf("�����淮:%.2f\n", leanBodyMass);
			System.out.printf("�������:%.2f\n", leanBodyRatio);
			System.out.printf("ü���淮:%.2f\n", bodyFatMass);
			System.out.printf("ü������:%.2f\n", bodyFatRatio);
			System.out.printf("���:" + result);

			// ��� ���� Ȯ��
			System.out.println();
			System.out.println("��� �Ͻðڽ��ϱ�? (yes/no)");
			String yesno = scanner.next();
			if (yesno.equals("no"))
				run = !run;
		} // while ��

		System.out.println("���α׷� ����");
	}

}
